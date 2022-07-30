package com.pdms.base.mapper;

import com.pdms.base.model.PdmsProdbatchLocationRuleCfg;

public interface PdmsProdbatchLocationRuleCfgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationRuleCfg record);

    int insertSelective(PdmsProdbatchLocationRuleCfg record);

    PdmsProdbatchLocationRuleCfg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationRuleCfg record);

    int updateByPrimaryKey(PdmsProdbatchLocationRuleCfg record);
}