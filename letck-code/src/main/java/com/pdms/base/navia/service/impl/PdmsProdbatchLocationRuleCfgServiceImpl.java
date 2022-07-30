package com.pdms.base.navia.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pdms.base.model.PdmsProdbatchLocationRuleCfg;
import com.pdms.base.mapper.PdmsProdbatchLocationRuleCfgMapper;
import com.pdms.base.navia.service.PdmsProdbatchLocationRuleCfgService;
@Service
public class PdmsProdbatchLocationRuleCfgServiceImpl implements PdmsProdbatchLocationRuleCfgService{

    @Resource
    private PdmsProdbatchLocationRuleCfgMapper pdmsProdbatchLocationRuleCfgMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsProdbatchLocationRuleCfgMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsProdbatchLocationRuleCfg record) {
        return pdmsProdbatchLocationRuleCfgMapper.insert(record);
    }

    @Override
    public int insertSelective(PdmsProdbatchLocationRuleCfg record) {
        return pdmsProdbatchLocationRuleCfgMapper.insertSelective(record);
    }

    @Override
    public PdmsProdbatchLocationRuleCfg selectByPrimaryKey(Long id) {
        return pdmsProdbatchLocationRuleCfgMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsProdbatchLocationRuleCfg record) {
        return pdmsProdbatchLocationRuleCfgMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsProdbatchLocationRuleCfg record) {
        return pdmsProdbatchLocationRuleCfgMapper.updateByPrimaryKey(record);
    }

}
