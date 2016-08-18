package cn.yunkuke.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yunkuke.dao.CourseFileDao;
import cn.yunkuke.dao.UsersDao;
import cn.yunkuke.entity.Users;
import cn.yunkuke.service.UsersService;

/**
 * @author zqb on 2016年7月28日
 */
@Service
public class UsersServiceImpl implements UsersService {

	private final static Logger LOG = LoggerFactory.getLogger(UsersServiceImpl.class);

	@Autowired
	private CourseFileDao courseFileDao;
	@Autowired
	private UsersDao usersDao;
	
	public boolean register(String userId, String userName, String userPassword, String userSchool, int userLevel) {
		
		return usersDao.insertUsers(userId, userName, userPassword, userSchool, userLevel);
	}

	public boolean login(String userId, String userPassword) {
		Users user = usersDao.checkLogin(userId, userPassword);
		if(user!=null) return true;
		else return false;
	}

	public boolean changeUserPassword(String userId, String userPassword) {
		
		return usersDao.changeUsersPassword(userId, userPassword);
	}

	public Users findUserById(String userId) {
		
		return usersDao.findUserById(userId);
	}

	public 	List<Users> findUserByName(String userName) {
		
		return usersDao.searchUsersByUsername(userName);
	}

	public List<Users> listUsersAll() {
		
		return usersDao.searchUsers();
	}

}
