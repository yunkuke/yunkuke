package cn.yunkuke.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.runners.Parameterized.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.yunkuke.entity.Users;
import cn.yunkuke.service.UsersService;

/**
 * @author zqb on 2016年7月30日
 */

@Controller
@RequestMapping("/user")
public class UsersController {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UsersService usersService;
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/doLogin")
	public String list(@Validated String userId, @Validated String userPassword) {
		// public String list(HttpServletRequest request ) {
		// String userId = request.getParameter("userId");
		// String userPassword = request.getParameter("userPassword");
		LOG.info(userId);
		LOG.info(userPassword);
		if (userId == null || userPassword == null) {
			return "redirect:/user/login";
		} else {
			boolean state = usersService.login(userId, userPassword);
			if (true == state) {
				return "redirect:/courses/fileQuary";
			} else {
				return "redirect:/user/login";
			}
		}
	}

	@RequestMapping(value = "/register")
	public String register() {
		return "register";
	}
	@RequestMapping(value = "/doRegister")
	public String doRegister(@Validated String userId, @Validated String userPassword,
			@Validated String userSchool,@Validated String userName,@Validated Integer userLevel) {
		LOG.info("Users [userId=" + userId + ", userName=" + userName
				+ ", userSchool=" + userSchool + ", userPassword="
				+ userPassword + ", userLevel=" + userLevel + "]");
		boolean state = usersService.register(userId, userName, userPassword, userSchool, userLevel);
		if(state==true){return "redirect:/user/login";}else{
			return "redirect:/user/register";
		}
	}

}
