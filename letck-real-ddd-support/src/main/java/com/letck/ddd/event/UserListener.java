package com.letck.ddd.event;

import com.letck.ddd.event.UserCancelEvent;
import com.letck.ddd.event.UserRegisterEvent;
import com.letck.ddd.event.entity.User;
import org.springframework.boot.test.util.ApplicationContextTestUtils;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener extends ApplicationContextTestUtils {

    @EventListener(UserRegisterEvent.class)
    public void userRegister(UserRegisterEvent event) {
        User user = (User) event.getSource();
        System.out.println("用户注册。。。发送短信。。。" + user);
        System.out.println("用户注册。。。发送邮件。。。" + user);
    }

    @EventListener(UserCancelEvent.class)
    public void userCancelEvent(UserCancelEvent event) {
        User user = (User) event.getSource();
        System.out.println("用户注销。。。" + user);
    }
}
