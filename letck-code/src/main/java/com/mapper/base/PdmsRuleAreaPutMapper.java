package com.mapper.base;

import com.domain.base.PdmsRuleAreaPut;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsRuleAreaPutMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleAreaPut record);

    int insertOrUpdate(PdmsRuleAreaPut record);

    int insertOrUpdateSelective(PdmsRuleAreaPut record);

    int insertSelective(PdmsRuleAreaPut record);

    PdmsRuleAreaPut selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleAreaPut record);

    int updateByPrimaryKey(PdmsRuleAreaPut record);

    int updateBatch(List<PdmsRuleAreaPut> list);

    int batchInsert(@Param("list") List<PdmsRuleAreaPut> list);
}