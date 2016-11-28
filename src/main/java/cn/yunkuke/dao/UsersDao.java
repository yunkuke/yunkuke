package cn.yunkuke.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import cn.yunkuke.entity.Users;

/** 
* @author zqb on 2016年7月27日 
*/
public interface UsersDao {
	/**
	 * 添加用户
	 * 
	 * @param userId
	 * 
	 * @param userName
	 * 
	 * @param userSchool
	 * 
	 * @param userPassword
	 * 
	 * @param userLevel
	 */
	public boolean insertUsers(@Param("userId") String userId,
			@Param("userName") String userName,
			@Param("userPassword") String userPassword,
			@Param("userSchool") String userSchool,
			@Param("userLevel") int userLevel);

	/**
	 * 删除用户
	 * 
	 * @param userId
	 * @return 
	 * 
	 */
	public boolean deleteUsers(String userId);

	/**
	 * 修改用户信息
	 * 
	 * @param userId
	 * 
	 * @param userPassword
	 */
	public boolean changeUsersPassword(@Param("userId")String userId,
			@Param("userPassword")String userPassword);

	/**
	 * 查询用户信息(后台)
	 * 
	 * @return List<Users>
	 */
	public ArrayList<Users> searchUsers();

	/**
	 * 根据用户名称查询用户信息(后台)
	 * 
	 * @return List<Users>
	 */
	public ArrayList<Users> searchUsersByUsername(String userName);

	/**
	 * 根据编号查询用户信息
	 * 
	 * @param id
	 * @return Users
	 */
	public Users findUserById(@Param("userId")String userId);

	/**
	 * 根据用户名和密码查询用户是否存在
	 * 
	 * @param userId
	 * @param userPassword
	 * @return Users ID
	 */
	public Users checkLogin(@Param("userId") String userId,
			@Param("userPassword") String userPassword);
	

}

