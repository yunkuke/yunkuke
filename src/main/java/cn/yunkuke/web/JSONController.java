package cn.yunkuke.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yunkuke.dto.JSONResult;
import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.service.CourseFileService;
import cn.yunkuke.service.UsersService;

/** 
* @author zqb on 2016年9月25日 
*/
@Controller
@RequestMapping("JSON")
public class JSONController {
	@Autowired
	private CourseFileService courseFileService;
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value = "/listjson",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
    public JSONResult<List> listJSON(Model model) {
		List<CourseFile> list = null;
		list = courseFileService.getCourseFileList();
        return new JSONResult<List>(true,list);
    }
	@RequestMapping(value = "/quaryjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
    public JSONResult<List> quaryJSON(@RequestParam(required=false) String courseFileName,@RequestParam(required=false) String courseFileCollege,
			@RequestParam(required=false) String courseFileSubject,Model model) {
		List<CourseFile> list = null;
		list = courseFileService.getCourseFileList(courseFileName,courseFileCollege,courseFileSubject);
        return new JSONResult<List>(true,list);
    }
	

}
