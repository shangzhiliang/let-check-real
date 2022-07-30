package com.sprucetec.pdms.base.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.base.PdmsRuleLimitMixingBaseMapper;
import com.domain.base.PdmsRuleLimitMixingBase;
import java.util.List;
import com.sprucetec.pdms.schedule.service.PdmsRuleLimitMixingBaseService;

@Service
public class PdmsRuleLimitMixingBaseServiceImpl implements PdmsRuleLimitMixingBaseService {

    @Resource
    private PdmsRuleLimitMixingBaseMapper pdmsRuleLimitMixingBaseMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsRuleLimitMixingBaseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsRuleLimitMixingBase record) {
        return pdmsRuleLimitMixingBaseMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsRuleLimitMixingBase record) {
        return pdmsRuleLimitMixingBaseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsRuleLimitMixingBase record) {
        return pdmsRuleLimitMixingBaseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsRuleLimitMixingBase record) {
        return pdmsRuleLimitMixingBaseMapper.insertSelective(record);
    }

    @Override
    public PdmsRuleLimitMixingBase selectByPrimaryKey(Long id) {
        return pdmsRuleLimitMixingBaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsRuleLimitMixingBase record) {
        return pdmsRuleLimitMixingBaseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsRuleLimitMixingBase record) {
        return pdmsRuleLimitMixingBaseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsRuleLimitMixingBase> list) {
        return pdmsRuleLimitMixingBaseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsRuleLimitMixingBase> list) {
        return pdmsRuleLimitMixingBaseMapper.batchInsert(list);
    }

}



