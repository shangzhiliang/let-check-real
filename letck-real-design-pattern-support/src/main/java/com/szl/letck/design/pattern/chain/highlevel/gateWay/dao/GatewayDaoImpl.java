package com.szl.letck.design.pattern.chain.highlevel.gateWay.dao;

import com.szl.letck.design.pattern.chain.highlevel.gateWay.Enums.GateWayEnum;
import com.szl.letck.design.pattern.chain.highlevel.gateWay.entity.GateWayEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GatewayDaoImpl
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 9:55
 */
public class GatewayDaoImpl implements GateWayDao{

    /**
     * 初始化，将枚举中配置的handler初始化到map中，方便获取
     */
    private static Map<Integer,GateWayEntity> gateWayEntityMap = new HashMap<>();

    static {
        GateWayEnum[] gateWayEnums =  GateWayEnum.values();
        for (GateWayEnum wayEnum : gateWayEnums){
            GateWayEntity gateWayEntity = wayEnum.getGateWayEntity();
            gateWayEntityMap.put(gateWayEntity.getHandlerId(),gateWayEntity);
        }

    }

    @Override
    public GateWayEntity getByHandlerId(Integer handlerId) {
        return gateWayEntityMap.get(handlerId);
    }

    @Override
    public GateWayEntity getFirstGateWayEntity() {

        for (Map.Entry<Integer, GateWayEntity> entry : gateWayEntityMap.entrySet()) {
            // 没有上一个handler的就是第一个处理者
            if(entry.getValue().getPreHandlerId() == null){
                return entry.getValue();
            }
        }

        return null;
    }
}
