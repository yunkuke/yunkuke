package cn.yunkuke.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.service.CourseFileService;

/** 
* @author zqb on 2016年11月28日 
*/
@Controller
@RequestMapping("online") 
public class OnlineController {
	@Autowired
	private CourseFileService courseFileService;
	
	String sepa = java.io.File.separator;
	
	public String enc(String str){
		try {
			return URLEncoder.encode(str,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return" ";
		}
	}	
	@RequestMapping(value = "/{courseFileId}/showOnline",method = RequestMethod.GET) 
    public String showOnline(HttpServletRequest request,  
    	      HttpServletResponse response,@PathVariable("courseFileId") Long courseFileId ,Model model) throws IOException{

		if(courseFileId==null){
			return "redirect:/error/404Error";
		}
		CourseFile courseFile = courseFileService.getCourseFileById(courseFileId);
		
		if(courseFile == null){
			return "redirect:/error/404Error";
		}
		
		response.setContentType("application/x-download"); 
		StringBuilder sbcourseFilePath = new StringBuilder().append(sepa).append("data").append(sepa).append("yunkuke")
				.append(sepa).append(enc(courseFile.getCourseFileCollege())).append(sepa+enc(courseFile.getCourseFileSubject()))
				.append(sepa+enc(courseFile.getCourseFileName()));

        //获取下载文件露肩
	    String downLoadPath = sbcourseFilePath.toString();

	    //获取文件的长度
	    long fileLength = new File(downLoadPath).length();  

	    //设置文件输出类型
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
	}
}
