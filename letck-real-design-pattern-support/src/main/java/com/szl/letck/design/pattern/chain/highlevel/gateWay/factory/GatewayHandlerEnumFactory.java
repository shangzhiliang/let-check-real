package com.szl.letck.design.pattern.chain.highlevel.gateWay.factory;

import com.szl.letck.design.pattern.chain.highlevel.gateWay.GatewayHandler;
import com.szl.letck.design.pattern.chain.highlevel.gateWay.dao.GateWayDao;
import com.szl.letck.design.pattern.chain.highlevel.gateWay.dao.GatewayDaoImpl;
import com.szl.letck.design.pattern.chain.highlevel.gateWay.entity.GateWayEntity;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName GatewayHandlerEnumFactory
 * @Desc 责任链的枚举者生产工厂,获取第一个责任链的处理者
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 10:04
 */
@Slf4j
public class GatewayHandlerEnumFactory {


    /**
     * 获取第一个责任链处理者并设置后续处理者
     * @author szl
     * @date 2022/7/28 10:42

     * @return GatewayHandler
     */
    public static GatewayHandler getFirstGatewayHandler(){
        GateWayDao gateWayDao = new GatewayDaoImpl();
        GateWayEntity gateWayEntity = gateWayDao.getFirstGateWayEntity();

        GatewayHandler firstHandler = createNewGatewayHandler(gateWayEntity);
        if(firstHandler == null){
            return null;
        }

        GateWayEntity tempGateWayEntity = gateWayEntity;
        Integer nextHandlerId = null;
        GatewayHandler tempGatewayHandler = firstHandler;
        // 迭代遍历所有handler，以及将它们链接起来
        while ((nextHandlerId = tempGateWayEntity.getNextHandlerId()) != null){
            GateWayEntity nextGateWayEntity = gateWayDao.getByHandlerId(nextHandlerId);
            //
            GatewayHandler newGatewayHandler = createNewGatewayHandler(nextGateWayEntity);
            tempGatewayHandler.setNextHandler(newGatewayHandler);

            tempGatewayHandler = newGatewayHandler;
            tempGateWayEntity = nextGateWayEntity;

        }

        //返回第一个责任链处理者
        return firstHandler;
    }


    /**
     * 反射实例化具体的处理者
     * @author szl
     * @date 2022/7/28 10:18
     * @param gateWayEntity
     * @return GatewayHandler
     */
    public static GatewayHandler createNewGatewayHandler(GateWayEntity gateWayEntity){
        //获取全限定名称
        String className = gateWayEntity.getConference();

        try {
           Class<?> clazz =  Class.forName(className);
           return (GatewayHandler) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
