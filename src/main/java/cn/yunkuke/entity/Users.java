package cn.yunkuke.entity; 
/** 
* @author zqb on 2016年7月27日 
*/
public class Users {
	/*
	 * 
	 * `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户id', `user_name`
	 * varchar(20) NOT NULL COMMENT '用户姓名', `user_password` varchar(20) NOT NULL
	 * COMMENT '用户密码', `user_school` varchar(50) NOT NULL COMMENT '用户所属学校',
	 */
	private String userId;
	private String userName;
	private String userSchool;
	private String userPassword;
	private int userLevel;
	/*
	 * 一个用户对应多个文件
	 */

	

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userSchool
	 */
	public String getUserSchool() {
		return userSchool;
	}

	/**
	 * @param userSchool
	 *            the userSchool to set
	 */
	public void setUserSchool(String userSchool) {
		this.userSchool = userSchool;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword
	 *            the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	

	/**
	 * @return the userLevel
	 */
	public int getUserLevel() {
		return userLevel;
	}

	/**
	 * @param userLevel
	 *            the userLevel to set
	 */
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName
				+ ", userSchool=" + userSchool + ", userPassword="
				+ userPassword + ", userLevel=" + userLevel + "]";
	}

}

