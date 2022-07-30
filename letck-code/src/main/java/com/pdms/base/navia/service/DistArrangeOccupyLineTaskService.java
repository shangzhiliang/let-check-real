package com.pdms.base.navia.service;

import com.pdms.base.model.DistArrangeOccupyLineTask;

public interface DistArrangeOccupyLineTaskService {


    int deleteByPrimaryKey(Long id);

    int insert(DistArrangeOccupyLineTask record);

    int insertSelective(DistArrangeOccupyLineTask record);

    DistArrangeOccupyLineTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DistArrangeOccupyLineTask record);

    int updateByPrimaryKey(DistArrangeOccupyLineTask record);

}



