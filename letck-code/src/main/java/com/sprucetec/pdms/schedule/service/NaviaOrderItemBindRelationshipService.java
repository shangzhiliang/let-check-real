package com.sprucetec.pdms.schedule.service;

import com.domain.schedule.NaviaOrderItemBindRelationship;import java.util.List;

/**
 * @ClassName NaviaOrderItemBindRelationshipService
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:34
 * @Version v1.0
 */
public interface NaviaOrderItemBindRelationshipService {


    int deleteByPrimaryKey(Long id);

    int insert(NaviaOrderItemBindRelationship record);

    int insertSelective(NaviaOrderItemBindRelationship record);

    NaviaOrderItemBindRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NaviaOrderItemBindRelationship record);

    int updateByPrimaryKey(NaviaOrderItemBindRelationship record);

    int insertOrUpdate(NaviaOrderItemBindRelationship record);

    int insertOrUpdateSelective(NaviaOrderItemBindRelationship record);

    int updateBatch(List<NaviaOrderItemBindRelationship> list);

    int updateBatchSelective(List<NaviaOrderItemBindRelationship> list);

    int batchInsert(List<NaviaOrderItemBindRelationship> list);
}



