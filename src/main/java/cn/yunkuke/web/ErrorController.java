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
		public String index() {
			return "error/noLogin";
		}
	
	
}