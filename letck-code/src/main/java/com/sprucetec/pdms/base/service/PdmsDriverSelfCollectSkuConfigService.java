package com.sprucetec.pdms.base.service;

import java.util.List;
import com.domain.base.PdmsDriverSelfCollectSkuConfig;
public interface PdmsDriverSelfCollectSkuConfigService{


    int deleteByPrimaryKey(Long id);

    int insert(PdmsDriverSelfCollectSkuConfig record);

    int insertOrUpdate(PdmsDriverSelfCollectSkuConfig record);

    int insertOrUpdateSelective(PdmsDriverSelfCollectSkuConfig record);

    int insertSelective(PdmsDriverSelfCollectSkuConfig record);

    PdmsDriverSelfCollectSkuConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsDriverSelfCollectSkuConfig record);

    int updateByPrimaryKey(PdmsDriverSelfCollectSkuConfig record);

    int updateBatch(List<PdmsDriverSelfCollectSkuConfig> list);

    int batchInsert(List<PdmsDriverSelfCollectSkuConfig> list);

}
