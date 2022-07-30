package com.mapper.base;

import com.domain.base.PdmsProdbatchLocationBySsu;

/**
 * @ClassName PdmsProdbatchLocationBySsuMapper
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 19:00
 * @Version v1.0
 */
public interface PdmsProdbatchLocationBySsuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationBySsu record);

    int insertSelective(PdmsProdbatchLocationBySsu record);

    PdmsProdbatchLocationBySsu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationBySsu record);

    int updateByPrimaryKey(PdmsProdbatchLocationBySsu record);
}