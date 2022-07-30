package com.mapper.base;

import com.domain.base.PdmsDriverSelfCollectSkuConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsDriverSelfCollectSkuConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsDriverSelfCollectSkuConfig record);

    int insertOrUpdate(PdmsDriverSelfCollectSkuConfig record);

    int insertOrUpdateSelective(PdmsDriverSelfCollectSkuConfig record);

    int insertSelective(PdmsDriverSelfCollectSkuConfig record);

    PdmsDriverSelfCollectSkuConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsDriverSelfCollectSkuConfig record);

    int updateByPrimaryKey(PdmsDriverSelfCollectSkuConfig record);

    int updateBatch(List<PdmsDriverSelfCollectSkuConfig> list);

    int batchInsert(@Param("list") List<PdmsDriverSelfCollectSkuConfig> list);
}