package cn.yunkuke.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.yunkuke.BaseTest;
import cn.yunkuke.entity.Users;

/**
 * @author zqb on 2016年7月29日
 */
public class UsersServiceImplTest extends BaseTest {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UsersService usersService;

	@Test
	public void testRegister() {
		String userId = "20220910";
		String userName = "zqb";
		String userSchool = "中国矿业大学";
		String userPassword = "yunkuke@cumt.cn";
		int userLevel = 0;
		boolean state = usersService.register(userId, userName, userPassword, userSchool, userLevel);
		if (state == true) {
			System.out.println("注册成功");
		} else {
			System.out.println("注册失败");
		}
	}

	@Test
	public void testLogin() {
		String userId = "1";
		String userPassword = "1";
		boolean state = usersService.login(userId, userPassword);
		if (state == true) {
			System.out.println("登陆成功");
		} else {
			System.out.println("登陆失败");
		}
	}

	@Test
	public void testChangeUserPassword() {
		String userId = "20220910";
		String userPassword = "newpassword";
		boolean state = usersService.changeUserPassword(userId, userPassword);
		if (state == true) {
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}
	}

	@Test
	public void testFindUserById() throws Exception{
		String userId = "10003";
		Users user = usersService.findUserById(userId);
		System.out.println(user.toString());
	}

	@Test
	public void testFindUserByName() {
		String userName = "zqb";
		List<Users> u = usersService.findUserByName(userName);
		for (Users users : u) {
			System.out.println(users.toString());
		}
	}

	@Test
	public void testListUsersAll() {
		List<Users> u = usersService.listUsersAll();
		for (Users users : u) {
			System.out.println(users.toString());
		}
	}

}
