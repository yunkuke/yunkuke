/*
 * 文件名：ZhpcUsersService.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：zqb
 * 修改时间：2017年3月22日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package cn.yunkuke.service;

import org.apache.ibatis.annotations.Param;

import cn.yunkuke.entity.ZhpcUsers;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author zqb
 * @version 2017年3月22日
 * @see ZhpcUsersService
 * @since
 */

public interface ZhpcUsersService
{
    
    boolean zhpcRegister(String userPhone, String userNickname, String userPassword, int userType, int userSex);
    
    ZhpcUsers findZhpcUser(long userId);
    
    ZhpcUsers findZhpcUser(String userPhone);
    
    long checkin(String userPhone, String userPassword);
}
