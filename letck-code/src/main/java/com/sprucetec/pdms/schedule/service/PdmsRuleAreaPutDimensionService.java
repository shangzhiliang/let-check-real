package com.sprucetec.pdms.schedule.service;

import java.util.List;
import com.domain.base.PdmsRuleAreaPutDimension;

public interface PdmsRuleAreaPutDimensionService {


    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleAreaPutDimension record);

    int insertOrUpdate(PdmsRuleAreaPutDimension record);

    int insertOrUpdateSelective(PdmsRuleAreaPutDimension record);

    int insertSelective(PdmsRuleAreaPutDimension record);

    PdmsRuleAreaPutDimension selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleAreaPutDimension record);

    int updateByPrimaryKey(PdmsRuleAreaPutDimension record);

    int updateBatch(List<PdmsRuleAreaPutDimension> list);

    int batchInsert(List<PdmsRuleAreaPutDimension> list);

}


