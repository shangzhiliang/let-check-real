package com.mapper.schedule;

import com.domain.schedule.NaviaOrderItemBindRelationship;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface NaviaOrderItemBindRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NaviaOrderItemBindRelationship record);

    int insertOrUpdate(NaviaOrderItemBindRelationship record);

    int insertOrUpdateSelective(NaviaOrderItemBindRelationship record);

    int insertSelective(NaviaOrderItemBindRelationship record);

    NaviaOrderItemBindRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NaviaOrderItemBindRelationship record);

    int updateByPrimaryKey(NaviaOrderItemBindRelationship record);

    int updateBatch(List<NaviaOrderItemBindRelationship> list);

    int batchInsert(@Param("list") List<NaviaOrderItemBindRelationship> list);

    int updateBatchSelective(List<NaviaOrderItemBindRelationship> list);
}