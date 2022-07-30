package com.mapper.base;

import com.domain.base.PdmsRuleMaterialLimitMixing;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsRuleMaterialLimitMixingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleMaterialLimitMixing record);

    int insertOrUpdate(PdmsRuleMaterialLimitMixing record);

    int insertOrUpdateSelective(PdmsRuleMaterialLimitMixing record);

    int insertSelective(PdmsRuleMaterialLimitMixing record);

    PdmsRuleMaterialLimitMixing selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleMaterialLimitMixing record);

    int updateByPrimaryKey(PdmsRuleMaterialLimitMixing record);

    int updateBatch(List<PdmsRuleMaterialLimitMixing> list);

    int batchInsert(@Param("list") List<PdmsRuleMaterialLimitMixing> list);
}