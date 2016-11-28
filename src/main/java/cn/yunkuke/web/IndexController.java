package cn.yunkuke.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yunkuke.dto.JSONResult;
import cn.yunkuke.service.UsersService;

/** 
* @author zqb on 2016年8月1日 
*/
@Controller
//@RequestMapping("index")
public class IndexController {
	@Autowired
	private UsersService usersService;
	

	@RequestMapping(value = "/index.htm")
	public String index(HttpServletRequest request,Model model) {
		return "index/index";
	}
	@RequestMapping(value = "/about.htm")
	public String about(HttpServletRequest request,Model model) {
		return "index/about";
	}
	@RequestMapping(value = "/c")
	public String c(HttpServletRequest request,Model model) {
		return "c";
	}

	@RequestMapping(value = "/time",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
    public JSONResult<Long> execute(Model model) {
        return new JSONResult<Long>(true,new Date().getTime());
        
    }



}
