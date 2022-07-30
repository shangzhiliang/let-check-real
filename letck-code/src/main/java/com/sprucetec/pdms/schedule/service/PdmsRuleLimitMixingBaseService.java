package com.sprucetec.pdms.schedule.service;

import com.domain.base.PdmsRuleLimitMixingBase;
import java.util.List;

public interface PdmsRuleLimitMixingBaseService {


    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleLimitMixingBase record);

    int insertOrUpdate(PdmsRuleLimitMixingBase record);

    int insertOrUpdateSelective(PdmsRuleLimitMixingBase record);

    int insertSelective(PdmsRuleLimitMixingBase record);

    PdmsRuleLimitMixingBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleLimitMixingBase record);

    int updateByPrimaryKey(PdmsRuleLimitMixingBase record);

    int updateBatch(List<PdmsRuleLimitMixingBase> list);

    int batchInsert(List<PdmsRuleLimitMixingBase> list);

}



