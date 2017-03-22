package cn.yunkuke.web;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.entity.Users;
import cn.yunkuke.service.CourseFileService;
import cn.yunkuke.service.UsersService;

/** 
* @author zqb on 2016年11月5日 
*/
/**
 * TODO
 * 1.更新文件信息
 * 2.激活用户状态
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController 
{

    @Autowired
	private UsersService usersService;
	@Autowired
	private CourseFileService courseFileService;
	@RequestMapping("/users")
	public String users(Model model){
		List<Users> allUser = usersService.listUsersAll();
		model.addAttribute("allUser",allUser);
		return "admin/users";
	}
	@RequestMapping("/{userId}/deletion")
	public String deleteUser(@PathVariable("userId") String userId){
		
		usersService.deleteUser(userId);
		return "admin/users";
		
	}
	
	public String enc(String str){
		try {
			return URLEncoder.encode(str,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return" ";
		}
	}
	@RequestMapping("/files")
	public String files(HttpServletRequest request,Model model){
		List<CourseFile> files = null;
		if(null!=request.getParameter("fileId")&&!"".equals(request.getParameter("fileId").trim())){
			files=new ArrayList<>();
			files.add(courseFileService.getCourseFileById(Long.parseLong(request.getParameter("fileId"))));
		}else{
		files =courseFileService.getCourseFileList();
		}
		model.addAttribute("files", files);
		return "admin/files";
	}
	
	@RequestMapping("/{courseFileId}/file_deletion")
	public String deletecourseFile(@PathVariable("courseFileId") long courseFileId){
		
	    String sepa = java.io.File.separator;
		
		try{
			CourseFile course = courseFileService.getCourseFileById(courseFileId);
//本机地址			
//			String courseFilePath = "g:\\"+sepa+"data"+sepa+"yunkuke"+sepa+enc(course.getCourseFileCollege())+sepa+enc(course.getCourseFileSubject())+sepa+enc(course.getCourseFileName()); 
//服务器地址
       StringBuilder sbcourseFilePath = new StringBuilder().append(sepa).append("data").append(sepa).append("yunkuke")
		.append(sepa).append(enc(course.getCourseFileCollege())).append(sepa+enc(course.getCourseFileSubject()))
		.append(sepa+enc(course.getCourseFileName()));
       String courseFilePath = sbcourseFilePath.toString();
			File file = new File(courseFilePath); 
			FileUtils.deleteQuietly(file);
		}catch(NullPointerException e){
			return "admin/files";
		}
		courseFileService.deleteCourseFileById(courseFileId);
		return "admin/files";
	}
}
