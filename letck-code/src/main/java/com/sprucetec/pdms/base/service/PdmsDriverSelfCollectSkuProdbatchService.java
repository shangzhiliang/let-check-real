package com.sprucetec.pdms.base.service;

import com.domain.base.PdmsDriverSelfCollectSkuProdbatch;
import java.util.List;
public interface PdmsDriverSelfCollectSkuProdbatchService{


    int deleteByPrimaryKey(Long id);

    int insert(PdmsDriverSelfCollectSkuProdbatch record);

    int insertOrUpdate(PdmsDriverSelfCollectSkuProdbatch record);

    int insertOrUpdateSelective(PdmsDriverSelfCollectSkuProdbatch record);

    int insertSelective(PdmsDriverSelfCollectSkuProdbatch record);

    PdmsDriverSelfCollectSkuProdbatch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsDriverSelfCollectSkuProdbatch record);

    int updateByPrimaryKey(PdmsDriverSelfCollectSkuProdbatch record);

    int updateBatch(List<PdmsDriverSelfCollectSkuProdbatch> list);

    int batchInsert(List<PdmsDriverSelfCollectSkuProdbatch> list);

}
