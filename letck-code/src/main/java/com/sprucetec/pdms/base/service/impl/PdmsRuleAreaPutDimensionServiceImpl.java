package com.sprucetec.pdms.base.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.mapper.base.PdmsRuleAreaPutDimensionMapper;
import com.domain.base.PdmsRuleAreaPutDimension;
import com.sprucetec.pdms.schedule.service.PdmsRuleAreaPutDimensionService;

@Service
public class PdmsRuleAreaPutDimensionServiceImpl implements PdmsRuleAreaPutDimensionService {

    @Resource
    private PdmsRuleAreaPutDimensionMapper pdmsRuleAreaPutDimensionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsRuleAreaPutDimensionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsRuleAreaPutDimension record) {
        return pdmsRuleAreaPutDimensionMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsRuleAreaPutDimension record) {
        return pdmsRuleAreaPutDimensionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsRuleAreaPutDimension record) {
        return pdmsRuleAreaPutDimensionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsRuleAreaPutDimension record) {
        return pdmsRuleAreaPutDimensionMapper.insertSelective(record);
    }

    @Override
    public PdmsRuleAreaPutDimension selectByPrimaryKey(Long id) {
        return pdmsRuleAreaPutDimensionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsRuleAreaPutDimension record) {
        return pdmsRuleAreaPutDimensionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsRuleAreaPutDimension record) {
        return pdmsRuleAreaPutDimensionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsRuleAreaPutDimension> list) {
        return pdmsRuleAreaPutDimensionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsRuleAreaPutDimension> list) {
        return pdmsRuleAreaPutDimensionMapper.batchInsert(list);
    }

}


