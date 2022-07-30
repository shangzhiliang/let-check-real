package com.mapper.base;

import com.domain.base.PdmsRuleLimitMixingBase;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsRuleLimitMixingBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleLimitMixingBase record);

    int insertOrUpdate(PdmsRuleLimitMixingBase record);

    int insertOrUpdateSelective(PdmsRuleLimitMixingBase record);

    int insertSelective(PdmsRuleLimitMixingBase record);

    PdmsRuleLimitMixingBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleLimitMixingBase record);

    int updateByPrimaryKey(PdmsRuleLimitMixingBase record);

    int updateBatch(List<PdmsRuleLimitMixingBase> list);

    int batchInsert(@Param("list") List<PdmsRuleLimitMixingBase> list);
}