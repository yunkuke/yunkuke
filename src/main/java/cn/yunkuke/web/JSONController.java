package cn.yunkuke.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yunkuke.dto.JSONResult;
import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.entity.Users;
import cn.yunkuke.service.CourseFileService;
import cn.yunkuke.service.UsersService;

/** 
* @author zqb on 2016年9月25日 
*/
@Controller
@RequestMapping("JSON")
public class JSONController 
{
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
	@RequestMapping(value = "/loginjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public JSONResult<Users> doLogin(@Validated String userId, @Validated String userPassword, HttpServletRequest request) {
             
        if (userId == null || userPassword == null) {
            
            //code == 0 用户名或密码不能为空
            return new JSONResult<Users>(false,"0");
        } else {

            boolean state = usersService.login(userId, userPassword);

            if (true == state) {
                HttpSession session = request.getSession();
                session.setAttribute("userId", userId);
                Users user = usersService.findUserById(userId);
                session.setAttribute("userLevel", user.getUserLevel());
                
                //登录成功
                return new JSONResult<Users>(true,user);
            } else {
                
                //code == 0 用户名或密码错误
                return new JSONResult<Users>(false,"0");
            }
        }
    }
	
	@RequestMapping(value = "/registerjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody	   
	public JSONResult<Boolean> doRegister(@Validated String userId, @Validated String userPassword, @Validated String userSchool,
	            @Validated String userName, @Validated Integer userLevel) {
	        if(null==userId||null==userName||
	            null==userPassword||null==userSchool||null==userLevel)
	        {
	            //信息输入不全 code==1
	            return new JSONResult<Boolean>(false,"1");
	        }else
	        {
	        boolean state = usersService.register(userId, userName, userPassword, userSchool, userLevel);
	        if (state == true) {
	            //注册成功
	            return new JSONResult<Boolean>(true,true);
	        } else {
	            //用户id重复 code==0
	            return new JSONResult<Boolean>(false,"0");
	        }
	        }
	    }
	
	@RequestMapping(value = "/userjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody      
    public JSONResult<Users> userjson(@Validated String userId) {        
	    Users user = usersService.findUserById(userId);
	    if (null != user) {               
                return new JSONResult<Users>(true,user);
            } else {
                return new JSONResult<Users>(false,"0");
            }
        }

}
