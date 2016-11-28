/**
 * 
 */
package cn.yunkuke.service;

import java.util.List;

import cn.yunkuke.entity.Users;

/**
 * 业务接口
 * 
 * @author zqb on 2016年7月28日
 */

public interface UsersService {
	/**
	 * 注册
	 */
	boolean register(String userId, String userName, String userPassword, String userSchool, int userLevel);

	/**
	 * 登陆
	 */
	boolean login(String userId, String userPassword);

	/**
	 * 修改密码
	 */
	boolean changeUserPassword(String userId, String userPassword);
	/**
	 * 删除用户
	 */
	boolean deleteUser(String userId);
	/**
	 * 根据id查找用户
	 */
	Users findUserById(String userId);

	/**
	 * 根据姓名用户
	 */
	List<Users> findUserByName(String userName);

	/**
	 * 查看所有用户
	 */
	List<Users> listUsersAll();

}
