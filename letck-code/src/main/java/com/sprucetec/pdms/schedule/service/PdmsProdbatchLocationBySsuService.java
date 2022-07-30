package com.sprucetec.pdms.schedule.service;

import com.domain.base.PdmsProdbatchLocationBySsu;
    /**
 * @ClassName PdmsProdbatchLocationBySsuService
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 19:00
 * @Version v1.0
 */
public interface PdmsProdbatchLocationBySsuService{


    int deleteByPrimaryKey(Long id);

    int insert(PdmsProdbatchLocationBySsu record);

    int insertSelective(PdmsProdbatchLocationBySsu record);

    PdmsProdbatchLocationBySsu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsProdbatchLocationBySsu record);

    int updateByPrimaryKey(PdmsProdbatchLocationBySsu record);

}
