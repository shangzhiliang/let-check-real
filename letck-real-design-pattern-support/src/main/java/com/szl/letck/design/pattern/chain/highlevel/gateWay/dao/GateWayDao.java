package com.szl.letck.design.pattern.chain.highlevel.gateWay.dao;

import com.szl.letck.design.pattern.chain.highlevel.gateWay.entity.GateWayEntity;

/**
 * @ClassName GateWayDao
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 9:42
 */
public interface GateWayDao {

    /**
     * 根据处理者索引获取处理者对象
     * @author szl
     * @date 2022/7/28 9:43
     * @param handlerId
     * @return GateWayEntity
     */
    GateWayEntity getByHandlerId(Integer handlerId);

    /**
     * 获取责任链第一个要处理的处理者
     * @author szl
     * @date 2022/7/28 9:44:12
     * @return GateWayEntity
     */
    GateWayEntity getFirstGateWayEntity();
}
