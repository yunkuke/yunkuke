package cn.yunkuke.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

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
	private final String slat = "JHJÓGJ$%^&*(wew34%+_)(*456789KBMB#$%^&*";
	@Autowired
	private CourseFileDao courseFileDao;
	@Autowired
	private UsersDao usersDao;
	
	
	private String MD5(String userPassword) {
        String base = userPassword + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
	
	@Override
	public boolean register(String userId, String userName, String userPassword, String userSchool, int userLevel) {
		System.out.println(MD5(userPassword));
		return usersDao.insertUsers(userId, userName,MD5(userPassword), userSchool, userLevel);
	}

	@Override
	public boolean login(String userId, String userPassword) {
		Users user = usersDao.checkLogin(userId, MD5(userPassword));
		if(user!=null) return true;
		else return false;
	}

	@Override
	public boolean changeUserPassword(String userId, String userPassword) {
		
		return usersDao.changeUsersPassword(userId, MD5(userPassword));
	}

	@Override
	public Users findUserById(String userId) {
		
		return usersDao.findUserById(userId);
	}

	@Override
	public 	List<Users> findUserByName(String userName) {
		
		return usersDao.searchUsersByUsername(userName);
	}

	@Override
	public List<Users> listUsersAll() {
		
		return usersDao.searchUsers();
	}

	@Override
	public boolean deleteUser(String userId) {
		return usersDao.deleteUsers(userId);
	}

}
