package com.mapper.base;

import com.domain.base.PdmsProdbatchLocationByCategory;

/**
 * @ClassName PdmsProdbatchLocationByCategoryMapper
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:57
 * @Version v1.0
 */
public interface PdmsProdbatchLocationByCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationByCategory record);

    int insertSelective(PdmsProdbatchLocationByCategory record);

    PdmsProdbatchLocationByCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationByCategory record);

    int updateByPrimaryKey(PdmsProdbatchLocationByCategory record);
}