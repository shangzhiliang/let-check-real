package com.sprucetec.pdms.base.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.mapper.base.PdmsRuleAreaPutMapper;
import com.domain.base.PdmsRuleAreaPut;
import com.sprucetec.pdms.schedule.service.PdmsRuleAreaPutService;

@Service
public class PdmsRuleAreaPutServiceImpl implements PdmsRuleAreaPutService {

    @Resource
    private PdmsRuleAreaPutMapper pdmsRuleAreaPutMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsRuleAreaPutMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsRuleAreaPut record) {
        return pdmsRuleAreaPutMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsRuleAreaPut record) {
        return pdmsRuleAreaPutMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsRuleAreaPut record) {
        return pdmsRuleAreaPutMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsRuleAreaPut record) {
        return pdmsRuleAreaPutMapper.insertSelective(record);
    }

    @Override
    public PdmsRuleAreaPut selectByPrimaryKey(Long id) {
        return pdmsRuleAreaPutMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsRuleAreaPut record) {
        return pdmsRuleAreaPutMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsRuleAreaPut record) {
        return pdmsRuleAreaPutMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsRuleAreaPut> list) {
        return pdmsRuleAreaPutMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsRuleAreaPut> list) {
        return pdmsRuleAreaPutMapper.batchInsert(list);
    }

}


