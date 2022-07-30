package com.mapper.base;

import com.domain.base.PdmsProdbatchLocationBySku;

/**
 * @ClassName PdmsProdbatchLocationBySkuMapper
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:59
 * @Version v1.0
 */
public interface PdmsProdbatchLocationBySkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationBySku record);

    int insertSelective(PdmsProdbatchLocationBySku record);

    PdmsProdbatchLocationBySku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationBySku record);

    int updateByPrimaryKey(PdmsProdbatchLocationBySku record);
}