/*
 * 文件名：ZhpcUserDao.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：zqb
 * 修改时间：2017年3月22日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package cn.yunkuke.dao;

import org.apache.ibatis.annotations.Param;

import cn.yunkuke.entity.ZhpcUsers;


/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author zqb
 * @version 2017年3月22日
 * @see ZhpcUsersDao
 * @since
 */

public interface ZhpcUsersDao
{ 
    
    public boolean insertZhpcUsers(
                               @Param("userPhone") String userPhone,
                               @Param("userNickname") String userNickname,
                               @Param("userPassword") String userPassword,
                               @Param("userType") int userType,
                               @Param("userSex") int userSex
                               
        );
    public long checkinZhpc(@Param("userPhone") String userPhone,
                                       @Param("userPassword")String userPassword);
    
    public ZhpcUsers findZhpcUserById(@Param("userId")long userId);
    
    public ZhpcUsers findZhpcUserByPhone(@Param("userPhone")String userPhone);
}
