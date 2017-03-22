/*
 * 文件名：ZhpcPcxx.java
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
 * @see ZhpcPcxx
 * @since
 */

public class ZhpcPcxx
{
    /*
    CREATE TABLE zhpcpcxx(    
                          `user_id` bigint  NOT NULL COMMENT '用户id',    
                          `start_pc` varchar(120) NOT NULL COMMENT '起点',
                          `end_pc` varchar(120) NOT NULL COMMENT '终点',
                          `car_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '预约时间',    
                          PRIMARY KEY(`user_id`)
                      )ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='拼车表';
   */
    
    private long userId;
    private String startPc;
    private String endPc;
    private String carTime;
    
    
    public long getUserId()
    {
        return userId;
    }
    public void setUserId(long userId)
    {
        this.userId = userId;
    }
    public String getStartPc()
    {
        return startPc;
    }
    public void setStartPc(String startPc)
    {
        this.startPc = startPc;
    }
    public String getEndPc()
    {
        return endPc;
    }
    public void setEndPc(String endPc)
    {
        this.endPc = endPc;
    }
    public String getCarTime()
    {
        return carTime;
    }
    public void setCarTime(String carTime)
    {
        this.carTime = carTime;
    }
    
    
    
   
}
