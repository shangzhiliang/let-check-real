package com.sprucetec.pdms.schedule.service;

import com.domain.base.PdmsProdbatchLocationByCategory;
    /**
 * @ClassName PdmsProdbatchLocationByCategoryService
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:57
 * @Version v1.0
 */
public interface PdmsProdbatchLocationByCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationByCategory record);

    int insertSelective(PdmsProdbatchLocationByCategory record);

    PdmsProdbatchLocationByCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationByCategory record);

    int updateByPrimaryKey(PdmsProdbatchLocationByCategory record);

}
