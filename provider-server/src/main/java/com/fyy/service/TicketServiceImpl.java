package com.fyy.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 *  @ClassName: TicketServiceImpl   
 *  @Description: 
 *  @Author: fu yuanyuan
 *  @CreateDate: 2020/10/8 18:46
 *  @UpdateUser:    
 *  @UpdateDate: 
 *  @UpdateRemark:    
 *  @Version: 1.0   
 */
@DubboService // 可以被扫描到，在项目一启动就自动注册到注册中心
@Component  // 注入容器
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "沸羊羊";
    }
}
