package com.szl.letck.design.pattern.chain.highlevel.gateWay.Enums;

import com.szl.letck.design.pattern.chain.highlevel.gateWay.entity.GateWayEntity;

/**
 * @ClassName GateWayEnum
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 9:29
 */
public enum GateWayEnum {
    //api 接口限流枚举类
    API_HANDLER(new GateWayEntity(1,
            "API接口限流","com.szl.letck.design.pattern.chain.highlevel.gateWay.impl.ApiLimitGatewayHandler",
            null,2)),
    //黑名单拦截枚举类
    BLACKLIST_HANDLER(new GateWayEntity(2,
            "黑名单拦截","com.szl.letck.design.pattern.chain.highlevel.gateWay.impl.BlacklistGatewayHandler",
            1,3)),
    //用户会话拦截枚举类
    SESSION_HANDLER(new GateWayEntity(3,
            "用户会话拦截","com.szl.letck.design.pattern.chain.highlevel.gateWay.impl.SessionGatewayHandler",
            2,null));

    GateWayEnum(GateWayEntity gateWayEntity) {
        this.gateWayEntity = gateWayEntity;
    }

    GateWayEntity gateWayEntity;

    public GateWayEntity getGateWayEntity(){
        return gateWayEntity;
    }

}
