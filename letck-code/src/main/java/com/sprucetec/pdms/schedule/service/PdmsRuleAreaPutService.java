package com.sprucetec.pdms.schedule.service;

import java.util.List;
import com.domain.base.PdmsRuleAreaPut;

public interface PdmsRuleAreaPutService {


    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleAreaPut record);

    int insertOrUpdate(PdmsRuleAreaPut record);

    int insertOrUpdateSelective(PdmsRuleAreaPut record);

    int insertSelective(PdmsRuleAreaPut record);

    PdmsRuleAreaPut selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleAreaPut record);

    int updateByPrimaryKey(PdmsRuleAreaPut record);

    int updateBatch(List<PdmsRuleAreaPut> list);

    int batchInsert(List<PdmsRuleAreaPut> list);

}


