package cn.yunkuke.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.entity.Users;

/** 
* @author zqb on 2016年7月27日 
*/

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class UsersDaoTest {
	// 注入dao实现类
	@Resource
	private CourseFileDao CourseFileDao;
	@Resource
	private UsersDao UsersDao;

	@Test
	public void testInsertUsers() throws Exception {

		String userId = "20220910";
		String userName = "zqb";
		String userSchool = "中国矿业大学";
		String userPassword = "yunkuke@cumt.cn";
		int userLevel = 0;
		boolean state = UsersDao.insertUsers(userId, userName, userPassword, userSchool, userLevel);
		if (state == true) {
			System.out.println("插入成功");
		} else {
			System.out.println("插入失败");
		}

	}

	@Test
	public void testDeleteUsers() throws NullPointerException{
		String userId = "2009";
		boolean state = false;
		try {
			state = UsersDao.deleteUsers(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (state == true) {

			System.out.println("delete" + userId + "成功");
		} else {
			System.out.println("delete" + userId + "失败");
		}
	}

	@Test
	public void testChangeUsersPassword() {
		String userId = "2022091";
		String userPassword = "new password";
		boolean state = UsersDao.changeUsersPassword(userId, userPassword);
		if (state == true) {
			System.out.println("修改" + userId + "密码成功" + userPassword);
		} else {
			System.out.println("修改" + userId + "密码失败");
		}
	}

	@Test
	public void testSearchUsers() {

		List<Users> user = UsersDao.searchUsers();
		for (Users u : user) {
			System.out.println(u.toString());
		}
	}

	@Test
	public void testSearchUsersByUsername() {
		String userName = "zqb";
		List<Users> user = UsersDao.searchUsersByUsername(userName);
		for (Users u : user) {
			System.out.println(u.toString());
		}
	}

	@Test
	public void testFindUserById() throws Exception{
		String userId = "08143427";
		Users user = null;
		try {
			user = UsersDao.findUserById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if ( user==null) {
			System.out.println("not exists");
		} else {
			System.out.println(user.toString());
		}
	}

	@Test
	public void testCheckLogin() {
		String userId = "10003";
		String userPassword = "789";
		Users user = UsersDao.checkLogin(userId, userPassword);
		if (user != null) {
			System.out.println("用户名密码不正确" + user.toString());
		} else {
			System.out.println("用户名或密码不正确");
		}

	}

}
