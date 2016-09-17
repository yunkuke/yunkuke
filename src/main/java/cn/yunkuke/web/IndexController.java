package cn.yunkuke.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yunkuke.dto.JSONResult;

/** 
* @author zqb on 2016年8月1日 
*/
@Controller
@RequestMapping("index")
public class IndexController {
	@RequestMapping(value = "/index")
	public String index() {
		return "navigation";
	}
	@RequestMapping(value = "/time",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
    public JSONResult<Long> execute(Model model) {
        return new JSONResult<Long>(true,new Date().getTime());
    }



}
