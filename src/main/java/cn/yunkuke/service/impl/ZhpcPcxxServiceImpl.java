/*
 * 文件名：ZhpcPcxxService.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：zqb
 * 修改时间：2017年3月22日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package cn.yunkuke.service.impl;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yunkuke.dao.ZhpcPcxxDao;
import cn.yunkuke.dao.ZhpcUsersDao;
import cn.yunkuke.entity.CourseFile;
import cn.yunkuke.entity.ZhpcPcxx;
import cn.yunkuke.service.ZhpcPcxxService;

/**
 * @author zqb on 2016年7月28日
 */
@Service

public class ZhpcPcxxServiceImpl implements ZhpcPcxxService
{

    private final static Logger LOG = LoggerFactory.getLogger(ZhpcPcxxServiceImpl.class);

    // 注入Service依赖
    @Autowired
    private ZhpcUsersDao zhpcUsersDao;
    @Autowired
    private ZhpcPcxxDao zhpcPcxxDao;

    @Override
    public boolean addZhpcPcxx(long userId, String startPc, String endPc, String carTime)
    {
        
        return zhpcPcxxDao.insertZhpcPcxx(userId, startPc, endPc, carTime);
    }
    
    @Override
    public List<ZhpcPcxx> findZhpcPcxx()
    {
       return zhpcPcxxDao.findZhpcUserById();
    }
    
    
   

}
