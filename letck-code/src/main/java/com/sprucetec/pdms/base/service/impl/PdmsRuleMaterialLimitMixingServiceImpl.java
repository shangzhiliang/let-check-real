package com.sprucetec.pdms.base.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.mapper.base.PdmsRuleMaterialLimitMixingMapper;
import com.domain.base.PdmsRuleMaterialLimitMixing;
import com.sprucetec.pdms.schedule.service.PdmsRuleMaterialLimitMixingService;

@Service
public class PdmsRuleMaterialLimitMixingServiceImpl implements PdmsRuleMaterialLimitMixingService {

    @Resource
    private PdmsRuleMaterialLimitMixingMapper pdmsRuleMaterialLimitMixingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsRuleMaterialLimitMixingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsRuleMaterialLimitMixing record) {
        return pdmsRuleMaterialLimitMixingMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsRuleMaterialLimitMixing record) {
        return pdmsRuleMaterialLimitMixingMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsRuleMaterialLimitMixing record) {
        return pdmsRuleMaterialLimitMixingMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsRuleMaterialLimitMixing record) {
        return pdmsRuleMaterialLimitMixingMapper.insertSelective(record);
    }

    @Override
    public PdmsRuleMaterialLimitMixing selectByPrimaryKey(Long id) {
        return pdmsRuleMaterialLimitMixingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsRuleMaterialLimitMixing record) {
        return pdmsRuleMaterialLimitMixingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsRuleMaterialLimitMixing record) {
        return pdmsRuleMaterialLimitMixingMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsRuleMaterialLimitMixing> list) {
        return pdmsRuleMaterialLimitMixingMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsRuleMaterialLimitMixing> list) {
        return pdmsRuleMaterialLimitMixingMapper.batchInsert(list);
    }

}


