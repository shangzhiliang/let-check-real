package com.mapper.base;

import com.domain.base.PdmsRuleAreaPutDimension;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsRuleAreaPutDimensionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsRuleAreaPutDimension record);

    int insertOrUpdate(PdmsRuleAreaPutDimension record);

    int insertOrUpdateSelective(PdmsRuleAreaPutDimension record);

    int insertSelective(PdmsRuleAreaPutDimension record);

    PdmsRuleAreaPutDimension selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsRuleAreaPutDimension record);

    int updateByPrimaryKey(PdmsRuleAreaPutDimension record);

    int updateBatch(List<PdmsRuleAreaPutDimension> list);

    int batchInsert(@Param("list") List<PdmsRuleAreaPutDimension> list);
}