package com.sprucetec.pdms.schedule.service;

import java.util.List;
import com.domain.base.PdmsRuleMaterialLimitMixing;

public interface PdmsRuleMaterialLimitMixingService {


    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleMaterialLimitMixing record);

    int insertOrUpdate(PdmsRuleMaterialLimitMixing record);

    int insertOrUpdateSelective(PdmsRuleMaterialLimitMixing record);

    int insertSelective(PdmsRuleMaterialLimitMixing record);

    PdmsRuleMaterialLimitMixing selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleMaterialLimitMixing record);

    int updateByPrimaryKey(PdmsRuleMaterialLimitMixing record);

    int updateBatch(List<PdmsRuleMaterialLimitMixing> list);

    int batchInsert(List<PdmsRuleMaterialLimitMixing> list);

}


