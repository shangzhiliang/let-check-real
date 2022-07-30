package com.szl.letck.design.pattern.chain.highlevel.gateWay.entity;

import lombok.Data;

/**
 * @ClassName GateWayEntity
 * @Desc 网关配置的实体类
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 8:45
 */
@Data
public class GateWayEntity {

    /**
     * 网关名称
     */
    private String name;

    /**
     * 网关实现引用类
     */
    private String conference;

    /**
     * 责任链的当前处理者ID
     */
    private Integer handlerId;

    /**
     * 责任链的前者处理者ID
     */
    private Integer preHandlerId;

    /**
     * 责任链的上下一关处理者ID
     */
    private Integer nextHandlerId;

    public GateWayEntity(Integer handlerId, String name, String conference, Integer preHandlerId, Integer nextHandlerId) {
        this.handlerId = handlerId;
        this.name = name;
        this.conference = conference;
        this.preHandlerId = preHandlerId;
        this.nextHandlerId= nextHandlerId;
    }
}
