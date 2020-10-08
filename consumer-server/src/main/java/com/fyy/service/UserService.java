package com.fyy.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 *  @ClassName: UserService   
 *  @Description: 
 *  @Author: fu yuanyuan
 *  @CreateDate: 2020/10/8 18:51
 *  @UpdateUser:    
 *  @UpdateDate: 
 *  @UpdateRemark:    
 *  @Version: 1.0   
 */
@Service    // 注入容器
public class UserService {
    // 想拿到 provider-server 提供的票
    // 调用提供者方法的两种方式：
    // 1、pom坐标
    // 2、可以定义路径相同的接口名
    @DubboReference     // 引用
    TicketService ticketService;

    public void buyTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到了" + ticket);
    }
}
