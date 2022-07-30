package com.pdms.base.navia.service;

import com.pdms.base.model.PdmsProdbatchLocationRuleCfg;
public interface PdmsProdbatchLocationRuleCfgService{


    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationRuleCfg record);

    int insertSelective(PdmsProdbatchLocationRuleCfg record);

    PdmsProdbatchLocationRuleCfg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationRuleCfg record);

    int updateByPrimaryKey(PdmsProdbatchLocationRuleCfg record);

}
