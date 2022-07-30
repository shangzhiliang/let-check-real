package com.sprucetec.pdms.base.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.domain.base.PdmsRuleMaterialPut;
import com.mapper.base.PdmsRuleMaterialPutMapper;
import com.sprucetec.pdms.schedule.service.PdmsRuleMaterialPutService;

@Service
public class PdmsRuleMaterialPutServiceImpl implements PdmsRuleMaterialPutService {

    @Resource
    private PdmsRuleMaterialPutMapper pdmsRuleMaterialPutMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsRuleMaterialPutMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsRuleMaterialPut record) {
        return pdmsRuleMaterialPutMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsRuleMaterialPut record) {
        return pdmsRuleMaterialPutMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsRuleMaterialPut record) {
        return pdmsRuleMaterialPutMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsRuleMaterialPut record) {
        return pdmsRuleMaterialPutMapper.insertSelective(record);
    }

    @Override
    public PdmsRuleMaterialPut selectByPrimaryKey(Long id) {
        return pdmsRuleMaterialPutMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsRuleMaterialPut record) {
        return pdmsRuleMaterialPutMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsRuleMaterialPut record) {
        return pdmsRuleMaterialPutMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsRuleMaterialPut> list) {
        return pdmsRuleMaterialPutMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsRuleMaterialPut> list) {
        return pdmsRuleMaterialPutMapper.batchInsert(list);
    }

}


