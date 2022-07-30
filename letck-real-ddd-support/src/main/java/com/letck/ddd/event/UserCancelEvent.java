package com.letck.ddd.event;

import org.springframework.context.ApplicationEvent;

/**
 * 用户注册事件
 */
public class UserCancelEvent extends ApplicationEvent {

    public UserCancelEvent(Object source) {
        super(source);
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
