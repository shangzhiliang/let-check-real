package com.sprucetec.pdms.schedule.service;

import java.util.List;
import com.domain.base.PdmsRuleMaterialPut;

public interface PdmsRuleMaterialPutService {


    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleMaterialPut record);

    int insertOrUpdate(PdmsRuleMaterialPut record);

    int insertOrUpdateSelective(PdmsRuleMaterialPut record);

    int insertSelective(PdmsRuleMaterialPut record);

    PdmsRuleMaterialPut selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleMaterialPut record);

    int updateByPrimaryKey(PdmsRuleMaterialPut record);

    int updateBatch(List<PdmsRuleMaterialPut> list);

    int batchInsert(List<PdmsRuleMaterialPut> list);

}


