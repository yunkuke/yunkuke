/*
 * 文件名：ZhpcUsers.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：zqb
 * 修改时间：2017年3月22日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package cn.yunkuke.entity;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author zqb
 * @version 2017年3月22日
 * @see ZhpcUsers
 * @since
 */

public class ZhpcUsers
{
    /*
    `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `user_phone` varchar(30) NOT NULL  COMMENT '用户电话',
    `user_nikename` varchar(20) NOT NULL COMMENT '用户昵称',
    `user_password` varchar(32) NOT NULL COMMENT '用户密码',    
    `user_type` int NOT NULL COMMENT '用户类型',
    `user_sex` int NOT NULL COMMENT '用户性别',
    */
    private long userId;
    private String userPhone;
    private String userNickname;
    private String userPassword;
    private int userType=0;
    private int userSex=0;
    public long getUserId()
    {
        return userId;
    }
    public void setUserId(long userId)
    {
        this.userId = userId;
    }
    public String getUserPhone()
    {
        return userPhone;
    }
    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone;
    }
    public String getUserNickname()
    {
        return userNickname;
    }
    public void setUserNickname(String userNickname)
    {
        this.userNickname = userNickname;
    }
    public String getUserPassword()
    {
        return userPassword;
    }
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }
    public int getUserType()
    {
        return userType;
    }
    public void setUserType(int userType)
    {
        this.userType = userType;
    }
    public int getUserSex()
    {
        return userSex;
    }
    public void setUserSex(int userSex)
    {
        this.userSex = userSex;
    }
}
