package cn.yunkuke.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.SoundbankResource;

import org.apache.commons.io.FileUtils;

import cn.yunkuke.dto.JSONResult;
import cn.yunkuke.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.service.CourseFileService;
import cn.yunkuke.service.UsersService;

/** 
* @author zqb on 2016年7月28日 
*/
@Controller
@RequestMapping("courses") // url:/模块/资源/{id}/list
public class CourseFileController {
	
	String sepa = java.io.File.separator;
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseFileService courseFileService;
	@Autowired
	private UsersService usersService;
	
	//@Validated
	
	@RequestMapping(value = "/list",method = RequestMethod.GET, produces = "text/html;charset=UTF-8")  
	public String list(@RequestParam(required=false) String courseFileName,@RequestParam(required=false) String courseFileCollege,
			@RequestParam(required=false) String courseFileSubject,Model model){
		//list.jsp + model = ModelAndView		
		List<CourseFile> list = null;
		//courseFileService.getCourseFileList();						
		if(courseFileName==null&&courseFileCollege==null&&courseFileSubject==null){
			list = courseFileService.getCourseFileList();
		}
		else if(courseFileName==""&&courseFileCollege==""&&courseFileSubject==""){
			list = courseFileService.getCourseFileList();
		}
		else if(courseFileName!=""){
			courseFileName=URLDecoder.decode(courseFileName);
			 list = courseFileService.getCourseFileByName(courseFileName);		
			}
		else if(courseFileCollege!=""){
			courseFileCollege=URLDecoder.decode(courseFileCollege);
			list = courseFileService.getCourseFileByCollege(courseFileCollege);
		}
		else if(courseFileSubject!=""){
			courseFileSubject=URLDecoder.decode(courseFileSubject);
			list = courseFileService.getCourseFileBySubject(courseFileSubject);
		}
		LOG.info(courseFileName);
		LOG.info(courseFileCollege);
		model.addAttribute("list",list);
		return "list";
//		List<CourseFile> list = courseFileService.getCourseFileList();
//		model.addAttribute("list",list);
//		return "list"; // WEB-INF/JSP/"list".jsp
	}
	
	//获得全部课程的json 无参数传入  实际使用时method改为post，无法通过url直接访问
	@RequestMapping(value = "/listjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
    public JSONResult<List> execute(Model model) {
		List<CourseFile> list = null;
		list = courseFileService.getCourseFileList();
        return new JSONResult<List>(true,list);
    }
	@RequestMapping(value = "/fileQuary")
	public String fileQuary(){
		return "fileQuary";
	}
	@RequestMapping(value = "/fileUpload")  
	public String fileUpload(){
		return "fileUpload"; 
	}
	public String enc(String str){
		try {
			return URLEncoder.encode(str,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return" ";
		}
	}
	/**
	 * 文件上传
	 * @param file
	 * @param request
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/doFileUpload")  
	public String doFileUpload(@RequestParam("courseFile") MultipartFile file,
			HttpServletRequest request,Model model) throws IOException{
		if(!file.isEmpty()){
			
			LOG.info("process file{}",file.getOriginalFilename());
//			String userId,  String courseFileCollege,
//			int courseFileGoodpoint, String courseFilePath, String courseFileImgpath, int courseFileLevel);
			//本机测试地址
			String despath = "g:\\"+sepa+"data"+sepa+"yunkuke";
			//服务器地址
			//String despath = sepa+"data"+sepa+"yunkuke";
			String userId="nnull";
			String courseFileName = file.getOriginalFilename().replaceAll(" ", "");
			String courseFileCollege =request.getParameter("courseFileCollege");
			String courseFileSubject = request.getParameter("courseFileSubject");
			long courseFileSize = file.getSize();
			int courseFileGoodpoint=0;
			String courseFilePath=despath+sepa+courseFileCollege+sepa+courseFileSubject;
			String courseFileImgpath="todo";
			Integer courseFileLevel =Integer.valueOf(request.getParameter("courseFileLevel"));
			model.addAttribute("courseFileSize",courseFileSize);
			courseFileService.insertFile(userId, courseFileName, courseFileSize, courseFileCollege, courseFileSubject,courseFileGoodpoint, courseFilePath, courseFileImgpath, courseFileLevel);
			//转码后真实文件地址
			String syspath=despath+sepa+enc(courseFileCollege)+sepa+enc(courseFileSubject);
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(syspath,enc(courseFileName)));
		}
		
		return "success"; 
	}
	/**
	 * 文件下载
	 * @param request
	 * @param response
	 * @param courseFileId
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/{courseFileId}/detail",method = RequestMethod.GET) 
    public String detail(HttpServletRequest request,  
    	      HttpServletResponse response,@PathVariable("courseFileId") Long courseFileId ,Model model) throws IOException{
		if(courseFileId==null){
			return "redirect:/courses/list";
		}
		CourseFile courseFile = courseFileService.getCourseFileById(courseFileId);
		
		if(courseFile == null){
			return "redirect:/courses/list";
		}
		CourseFile course =courseFileService.getCourseFileById(courseFileId);
		response.setContentType("application/x-download"); 
		//本机测试地址
		String courseFilePath1 = "g:\\"+sepa+"data"+sepa+"yunkuke"+sepa+enc(course.getCourseFileCollege())+sepa+enc(course.getCourseFileSubject())+sepa+enc(course.getCourseFileName());
		//服务器地址
		//String courseFilePath1 = sepa+"data"+sepa+"yunkuke"+sepa+enc(course.getCourseFileCollege())+sepa+enc(course.getCourseFileSubject())+sepa+enc(course.getCourseFileName());
		LOG.info(sepa+"data"+sepa+"yunkuke"+sepa+course.getCourseFileCollege()+course.getCourseFileSubject()+sepa+course.getCourseFileName());
		LOG.info(courseFilePath1);  
//		response.addHeader("Content-Disposition","attachment;filename=" + courseFile.getCourseFileName());   
		model.addAttribute("courseFilePath1",courseFilePath1);
	    
	    //获取下载文件露肩
	    String downLoadPath = courseFilePath1;  
	  
	    //获取文件的长度
	    long fileLength = new File(downLoadPath).length();  

	    //设置文件输出类型
	    response.setContentType("application/octet-stream");  
	    response.setHeader("Content-disposition", "attachment; filename="  
	        + new String(courseFile.getCourseFileName().getBytes("utf-8"), "ISO8859-1")); 
	    //设置输出长度
	    response.setHeader("Content-Length", String.valueOf(fileLength));  
	    //获取输入流
	    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(downLoadPath));  
	    //输出流
	    BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());  
	    byte[] buff = new byte[2048];  
	    int bytesRead;  
	    while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
	      bos.write(buff, 0, bytesRead);  
	    }  
	    //关闭流
	    bis.close();  
	    bos.close();  
        return "detail";
    }
	@RequestMapping(value = "/{courseFileId}/goodpoint",method = RequestMethod.GET) 
    public String doGoodpoint(HttpServletRequest request,  
    	      HttpServletResponse response,@PathVariable("courseFileId") Long courseFileId ,Model model) throws IOException{
		if(courseFileId==null){
			return "redirect:/courses/list";
		}
		CourseFile courseFile = courseFileService.getCourseFileById(courseFileId);
		
		 if(courseFile == null){
			return "redirect:/courses/list";
		}
		 
		 courseFileService.increaseGoodpoint(courseFileId);
		
        return "forward:/courses/list";
    }

}
