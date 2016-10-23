package cn.yunkuke.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String login = (String) session.getAttribute("userId");
		if (login != null) {
			return "redirect:/user/userInfo";
		} else {
			return "login";
		}
	}

	@RequestMapping(value = "/doLogin")
	public String doLogin(@Validated String userId, @Validated String userPassword, HttpServletRequest request) {
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
				HttpSession session = request.getSession();
				session.setAttribute("userId", userId);
				Users user = usersService.findUserById(userId);
				session.setAttribute("userLevel", user.getUserLevel());
				return "redirect:/courses/list";
			} else {
				return "redirect:../error/loginFail";
			}
		}
	}

	@RequestMapping(value = "/register")
	public String register() {
		return "register";
	}

	@RequestMapping(value = "/userInfo")
	public String userInfo(HttpServletRequest request, Model model) {
		try {
			HttpSession session = request.getSession();
			String userId = (String) session.getAttribute("userId");
			Users user = usersService.findUserById(userId);
			int userLevel =(int)session.getAttribute("userLevel");
			String ulevel=" ";
			if (userLevel == 0) {
				 ulevel = "学生用户";
			} else {
				 ulevel = "教师用户";
			}
			model.addAttribute("uLevel",ulevel);
			model.addAttribute("userInfo", user);
			return "userInfo";
		} catch (Exception e) {
			return "redirect:../error/noLogin";
		}
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request) {
		// HttpServletRequest
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}

	@RequestMapping(value = "/doRegister")
	public String doRegister(@Validated String userId, @Validated String userPassword, @Validated String userSchool,
			@Validated String userName, @Validated Integer userLevel) {
		LOG.info("Users [userId=" + userId + ", userName=" + userName + ", userSchool=" + userSchool + ", userPassword="
				+ userPassword + ", userLevel=" + userLevel + "]");
		boolean state = usersService.register(userId, userName, userPassword, userSchool, userLevel);
		if (state == true) {
			return "redirect:/user/login";
		} else {
			return "redirect:/user/register";
		}
	}

}
