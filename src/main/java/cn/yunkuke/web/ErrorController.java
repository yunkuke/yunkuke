package cn.yunkuke.web;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/** 
* @author zqb on 2016年9月17日 
*/
@Controller
@RequestMapping("error")
public class ErrorController {
	
	
	
		@RequestMapping(value = "/noLogin")
		public String noLogin() {
			return "error/noLogin";
		}
		@RequestMapping(value = "/loginFail")
		public String loginFail() {
			return "error/loginFail";
		}
		@RequestMapping(value = "/noPower")
		public String noPower() {
			return "error/noPower";
		}
		@RequestMapping(value = "/404Error")
		public String error404() {
			return "error/404Error";
		}
	
	
}