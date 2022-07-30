package com.pdms.base.mapper;

import com.pdms.base.model.DistArrangeOccupyLineTask;

public interface DistArrangeOccupyLineTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DistArrangeOccupyLineTask record);

    int insertSelective(DistArrangeOccupyLineTask record);

    DistArrangeOccupyLineTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DistArrangeOccupyLineTask record);

    int updateByPrimaryKey(DistArrangeOccupyLineTask record);
}