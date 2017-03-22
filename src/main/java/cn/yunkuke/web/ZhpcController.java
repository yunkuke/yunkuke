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
import cn.yunkuke.entity.ZhpcPcxx;
import cn.yunkuke.entity.ZhpcUsers;
import cn.yunkuke.service.ZhpcPcxxService;
import cn.yunkuke.service.ZhpcUsersService;


/** 
* @author zqb on 2016年9月25日 
*/
@Controller
@RequestMapping("zhpc")
public class ZhpcController 
{
	@Autowired
	private ZhpcUsersService zhpcUsersService;
	@Autowired
	private ZhpcPcxxService zhpcPcxxService;
	
  @RequestMapping(value = "/loginjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
  @ResponseBody
  public JSONResult<ZhpcUsers> doLogin(@Validated String userPhone, @Validated String userPassword, HttpServletRequest request) {
           
      if (userPhone == null || userPassword == null) {
          
          //code == 0 用户名或密码不能为空
          return new JSONResult<ZhpcUsers>(false,"0");
      } else {

          long state = zhpcUsersService.checkin(userPhone, userPassword);

          if ( state>0) {              
              //登录成功
              ZhpcUsers user = zhpcUsersService.findZhpcUser(state);
              return new JSONResult<ZhpcUsers>(true,user);
          } else {
              
              //code == 0 用户名或密码错误
              return new JSONResult<ZhpcUsers>(false,"0");
          }
      }
  }
  
  @RequestMapping(value = "/userjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
  @ResponseBody
  public JSONResult<ZhpcUsers> doLogin(@Validated String userPhone) {
           
      if (userPhone == null ) {
          
          //code == 0 用户名或密码不能为空
          return new JSONResult<ZhpcUsers>(false,"0");
      } else {

          
              ZhpcUsers user = zhpcUsersService.findZhpcUser(userPhone);
              return new JSONResult<ZhpcUsers>(true,user);
          } 
      }
  
  
  @RequestMapping(value = "/registerjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
  @ResponseBody      
  public JSONResult<Boolean> doRegister(@Validated String userPhone, @Validated String userPassword, 
                                        @Validated String userNickname,
                                        @Validated Integer userType, @Validated Integer userSex) {
          if(null==userPhone||null==userPassword||
              null==userNickname||null==userType||null==userSex)
          {
              //信息输入不全 code==1
              return new JSONResult<Boolean>(false,"1");
          }else
          {
          boolean state = zhpcUsersService.zhpcRegister(userPhone, userNickname, userPassword, userType, userSex);            
          if (state == true) {
              //注册成功
              return new JSONResult<Boolean>(true,true);
          } else {
              //用户id重复 code==0
              return new JSONResult<Boolean>(false,"0");
          }
          }
      }
  

  @RequestMapping(value = "/addpcxx",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
  @ResponseBody      
  public JSONResult<Boolean> doAddPcxx(@Validated Long userId, @Validated String startPc, 
                                        @Validated String endPc,
                                        @Validated String carTime) {
          if(null==userId||null==startPc||
              null==endPc||null==carTime)
          {
              
              //信息输入不全 code==1
              return new JSONResult<Boolean>(false,"1");
          }else
          { 


              
          boolean state = zhpcPcxxService.addZhpcPcxx(userId, startPc, endPc, carTime);
                   
          if (state == true) {
              //注册成功
              return new JSONResult<Boolean>(true,true);
          } else {
              //用户id重复 code==0
              return new JSONResult<Boolean>(false,"0");
          }
          }
      }
  @RequestMapping(value = "/findpcxx",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
  @ResponseBody      
  public JSONResult<List<ZhpcPcxx>> doAddPcxx() {
          List<ZhpcPcxx> list = null;
          list = zhpcPcxxService.findZhpcPcxx();
          return new JSONResult<List<ZhpcPcxx>>(true,list);
          
      }
  
  
	
//	@RequestMapping(value = "/listjson",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
//	@ResponseBody
//    public JSONResult<List> listJSON(Model model) {
//		List<CourseFile> list = null;
//		list = courseFileService.getCourseFileList();
//        return new JSONResult<List>(true,list);
//    }
//	@RequestMapping(value = "/quaryjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
//	@ResponseBody
//    public JSONResult<List> quaryJSON(@RequestParam(required=false) String courseFileName,@RequestParam(required=false) String courseFileCollege,
//			@RequestParam(required=false) String courseFileSubject,Model model) {
//		List<CourseFile> list = null;
//		list = courseFileService.getCourseFileList(courseFileName,courseFileCollege,courseFileSubject);
//        return new JSONResult<List>(true,list);
//    }

//	
//	@RequestMapping(value = "/registerjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
//    @ResponseBody	   
//	public JSONResult<Boolean> doRegister(@Validated String userId, @Validated String userPassword, @Validated String userSchool,
//	            @Validated String userName, @Validated Integer userLevel) {
//	        if(null==userId||null==userName||
//	            null==userPassword||null==userSchool||null==userLevel)
//	        {
//	            //信息输入不全 code==1
//	            return new JSONResult<Boolean>(false,"1");
//	        }else
//	        {
//	        boolean state = usersService.register(userId, userName, userPassword, userSchool, userLevel);
//	        if (state == true) {
//	            //注册成功
//	            return new JSONResult<Boolean>(true,true);
//	        } else {
//	            //用户id重复 code==0
//	            return new JSONResult<Boolean>(false,"0");
//	        }
//	        }
//	    }
	
//	@RequestMapping(value = "/userjson",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
//    @ResponseBody      
//    public JSONResult<Users> userjson(@Validated String userId) {        
//	    Users user = usersService.findUserById(userId);
//	    if (null != user) {               
//                return new JSONResult<Users>(true,user);
//            } else {
//                return new JSONResult<Users>(false,"0");
//            }
//        }

}
