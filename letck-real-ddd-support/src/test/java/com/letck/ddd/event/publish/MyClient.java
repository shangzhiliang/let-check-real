package com.letck.ddd.event.publish;

import com.letck.ddd.event.UserCancelEvent;
import com.letck.ddd.event.UserRegisterEvent;
import com.letck.ddd.event.entity.User;
import com.letck.ddd.event.UserListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author
 * 事件发布
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyClient.class)
@ComponentScan(basePackages = {"com.letck.ddd"})
public class MyClient {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test() {
        User user = new User();
        //发布事件
        applicationContext.publishEvent(new UserRegisterEvent(user));

        //发布事件
        applicationContext.publishEvent(new UserCancelEvent(user));

//      userListener.userRegister();
    }
}
