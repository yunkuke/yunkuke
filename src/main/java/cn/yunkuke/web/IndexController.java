package cn.yunkuke.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author zqb on 2016年8月1日 
*/
@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping(value = "/index")
	public String index() {
		return "list";
	}
}
