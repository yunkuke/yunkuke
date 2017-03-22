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

package cn.yunkuke.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yunkuke.entity.ZhpcPcxx;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author zqb
 * @version 2017年3月22日
 * @see ZhpcPcxxService
 * @since
 */

public interface ZhpcPcxxService
{
   
    boolean addZhpcPcxx(long userId, String startPc, String endPc, String carTime);
    
    List<ZhpcPcxx> findZhpcPcxx();
                       
}
