package com.szl.letck.spring.service;

import com.szl.letck.spring.Food;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName UserService
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/8 20:20
 */
@Component
public class UserService implements InitializingBean {

    @Autowired
    private OrderService orderService;

    private Food food;

    public void userTest(){
        System.out.println(orderService);
    }


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public void aVoid(){

    }
}
