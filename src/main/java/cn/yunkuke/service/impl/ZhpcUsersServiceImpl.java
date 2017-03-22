package cn.yunkuke.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import cn.yunkuke.dao.ZhpcPcxxDao;
import cn.yunkuke.dao.ZhpcUsersDao;
import cn.yunkuke.entity.ZhpcUsers;
import cn.yunkuke.service.ZhpcUsersService;



/**
 * @author zqb on 2016年7月28日
 */
@Service
public class ZhpcUsersServiceImpl implements ZhpcUsersService {

    private final static Logger LOG = LoggerFactory.getLogger(ZhpcUsersServiceImpl.class);
    private final String slat = "JHJÓGJ$%^&*(wew34%+_)(*456789KBMB#$%^&*";
    @Autowired
    private ZhpcUsersDao zhpcUsersDao;
    @Autowired
    private ZhpcPcxxDao zhpcPcxxDao;
    
    
    private String MD5(String userPassword) {
        String base = userPassword + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
    
    @Override
    public boolean zhpcRegister(String userPhone, String userNickname, String userPassword,
                                int userType, int userSex)
    {
        return zhpcUsersDao.insertZhpcUsers(userPhone, userNickname, MD5(userPassword), userType, userSex);        
    }
    
    @Override
    public long checkin(String userPhone, String userPassword) 
    {
        return zhpcUsersDao.checkinZhpc(userPhone, MD5(userPassword));       
    }
    @Override
    public ZhpcUsers findZhpcUser(long userId)
    {
        
        return zhpcUsersDao.findZhpcUserById(userId);
    }
    @Override
    public ZhpcUsers findZhpcUser(String userPhone)
    {
        
        return zhpcUsersDao.findZhpcUserByPhone(userPhone);
    }
    
   

}
