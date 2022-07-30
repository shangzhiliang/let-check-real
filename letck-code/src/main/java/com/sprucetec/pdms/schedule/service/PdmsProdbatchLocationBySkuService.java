package com.sprucetec.pdms.schedule.service;

import com.domain.base.PdmsProdbatchLocationBySku;
    /**
 * @ClassName PdmsProdbatchLocationBySkuService
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:59
 * @Version v1.0
 */
public interface PdmsProdbatchLocationBySkuService{


    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationBySku record);

    int insertSelective(PdmsProdbatchLocationBySku record);

    PdmsProdbatchLocationBySku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationBySku record);

    int updateByPrimaryKey(PdmsProdbatchLocationBySku record);

}
