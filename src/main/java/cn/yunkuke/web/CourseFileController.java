package cn.yunkuke.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FileUtils;

import cn.yunkuke.dto.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.service.CourseFileService;
import cn.yunkuke.service.UsersService;
import cn.yunkuke.until.SessionUntil;

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
	
	SessionUntil sessionUntil = new SessionUntil();
	
	//@Validated

	@RequestMapping(value = "/list", produces = "text/html;charset=UTF-8")  
	public String list(@RequestParam(required=false) String courseFileName,@RequestParam(required=false) String courseFileCollege,
			@RequestParam(required=false) String courseFileSubject,@RequestParam(required=false,defaultValue="null") String fileQuaryStr,Model model){
		//list.jsp + model = ModelAndView		
		List<CourseFile> list = null;
	//	Set<Long> set=new HashSet<Long>();
		Map<Long, CourseFile> courseFileMap = new HashMap<>();
		if(!"null".equals(fileQuaryStr)){
		list=courseFileService.getCourseFileList(fileQuaryStr, null, null);
		list.addAll(courseFileService.getCourseFileList(null, fileQuaryStr, null));
		list.addAll(courseFileService.getCourseFileList(null, null, fileQuaryStr));
		//Set<CourseFile> set = new HashSet<CourseFile>(list);
		for(int i=0,size=list.size();i<size;i++){
			courseFileMap.put(list.get(i).getCourseFileId(), list.get(i));
		}
		list.clear();
		//for(int i=0;i<courseFileMap.size();i++){
			list.addAll(courseFileMap.values());
		//}
		//list.addAll();
	    System.out.println(list.size());
		}
		else{
		list=courseFileService.getCourseFileList(courseFileName, courseFileCollege, courseFileSubject);
		}
		//courseFileService.getCourseFileList();						
//		if(courseFileName==null&&courseFileCollege==null&&courseFileSubject==null){
//			list = courseFileService.getCourseFileList();
//		}
//		else if(courseFileName==""&&courseFileCollege==""&&courseFileSubject==""){
//			list = courseFileService.getCourseFileList();
//		}
//		else if(courseFileName!=""){
//			courseFileName=URLDecoder.decode(courseFileName);
//			 list = courseFileService.getCourseFileByName(courseFileName);		
//			}
//		else if(courseFileCollege!=""){
//			courseFileCollege=URLDecoder.decode(courseFileCollege);
//			list = courseFileService.getCourseFileByCollege(courseFileCollege);
//		}
//		else if(courseFileSubject!=""){
//			courseFileSubject=URLDecoder.decode(courseFileSubject);
//			list = courseFileService.getCourseFileBySubject(courseFileSubject);
//		}
		LOG.info("fileQuaryStr"+fileQuaryStr);
		LOG.info("courseFileName  "+courseFileName);
		LOG.info("courseFileCollege  "+courseFileCollege);
		LOG.info("courseFileSubject  "+courseFileSubject);
		LOG.info("list  "+list);
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
		if(!sessionUntil.isNull(request)&&sessionUntil.getSessionLevel(request)==1){
		if(!file.isEmpty()){
			
			LOG.info("process file{}",file.getOriginalFilename());
//			String userId,  String courseFileCollege,
//			int courseFileGoodpoint, String courseFilePath, String courseFileImgpath, int courseFileLevel);
			//本机测试地址
//			String despath = "g:\\"+sepa+"data"+sepa+"yunkuke";
			//服务器地址
			StringBuilder despath = new StringBuilder().append(sepa).append("data").append(sepa).append("yunkuke");
			String userId=sessionUntil.getSessionID(request);
			System.out.println(userId);
			String courseFileName = file.getOriginalFilename().replaceAll(" ", "");
			String courseFileCollege =request.getParameter("courseFileCollege");
			String courseFileSubject = request.getParameter("courseFileSubject");
			long courseFileSize = file.getSize();
			int courseFileGoodpoint=0;
			StringBuilder courseFilePath=new StringBuilder().append(despath.toString())
					.append(sepa).append(courseFileCollege)
					.append(sepa).append(courseFileSubject);
			String courseFileImgpath="todo";
			Integer courseFileLevel =Integer.valueOf(request.getParameter("courseFileLevel"));
			model.addAttribute("courseFileSize",courseFileSize);
			courseFileService.insertFile(userId, courseFileName, courseFileSize, courseFileCollege,
					courseFileSubject,courseFileGoodpoint, courseFilePath.toString(), courseFileImgpath, courseFileLevel);
			//转码后真实文件地址
			StringBuilder syspath=new StringBuilder().append(despath.toString()).append(sepa).append(enc(courseFileCollege)).
					append(sepa).append(enc(courseFileSubject));
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(syspath.toString(),enc(courseFileName)));
		}
		
		return "success"; }else{
			return "redirect:/error/noPower";
		}
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
	@RequestMapping(value = "/{courseFileId}/download",method = RequestMethod.GET) 
    public String download(HttpServletRequest request,  
    	      HttpServletResponse response,@PathVariable("courseFileId") Long courseFileId ,Model model) throws IOException{
		
		if(courseFileId==null){
			return "redirect:/error/404Error";
		}
		CourseFile courseFile = courseFileService.getCourseFileById(courseFileId);
		
		if(courseFile == null){
			return "redirect:/error/404Error";
		}
		CourseFile course =courseFileService.getCourseFileById(courseFileId);
//		if(!sessionUntil.isNull(request)&&sessionUntil.getSessionLevel(request)>=courseFile.getCourseFileLevel()){
		response.setContentType("application/x-download"); 
//		//本机测试地址
//		String courseFilePath1 = "g:\\"+sepa+"data"+sepa+"yunkuke"+sepa+enc(course.getCourseFileCollege())+sepa+enc(course.getCourseFileSubject())+sepa+enc(course.getCourseFileName());
//		//服务器地址
		StringBuilder courseFilePath1 = new StringBuilder().append(sepa).append("data").append(sepa).append("yunkuke")
				.append(sepa).append(enc(course.getCourseFileCollege())).append(sepa+enc(course.getCourseFileSubject()))
				.append(sepa+enc(course.getCourseFileName()));
//		LOG.info(sepa+"data"+sepa+"yunkuke"+sepa+course.getCourseFileCollege()+course.getCourseFileSubject()+sepa+course.getCourseFileName());
//		LOG.info(courseFilePath1);  
		response.addHeader("Content-Disposition","attachment;filename=" + courseFile.getCourseFileName()); 
//		courseFilePath1="http://ow365.cn/?i=10787&furl="+"http://119.29.75.25/yunkuke/courses/"+courseFileId+"/download";
		model.addAttribute("courseFilePath1",courseFilePath1.toString());
//		System.out.println(courseFilePath1.toString());
//	    
//	    //获取下载文件露肩
	    String downLoadPath = courseFilePath1.toString();
//	  
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
	  
	    	    
        return null;
//        }else{
//        	return "redirect:/error/noPower";
//        }
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
