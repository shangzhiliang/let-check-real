package com.mapper.base;

import com.domain.base.PdmsRuleMaterialPut;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsRuleMaterialPutMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleMaterialPut record);

    int insertOrUpdate(PdmsRuleMaterialPut record);

    int insertOrUpdateSelective(PdmsRuleMaterialPut record);

    int insertSelective(PdmsRuleMaterialPut record);

    PdmsRuleMaterialPut selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleMaterialPut record);

    int updateByPrimaryKey(PdmsRuleMaterialPut record);

    int updateBatch(List<PdmsRuleMaterialPut> list);

    int batchInsert(@Param("list") List<PdmsRuleMaterialPut> list);
}