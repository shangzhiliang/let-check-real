package com.mapper.base;

import com.domain.base.PdmsDriverSelfCollectSkuProdbatch;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsDriverSelfCollectSkuProdbatchMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsDriverSelfCollectSkuProdbatch record);

    int insertOrUpdate(PdmsDriverSelfCollectSkuProdbatch record);

    int insertOrUpdateSelective(PdmsDriverSelfCollectSkuProdbatch record);

    int insertSelective(PdmsDriverSelfCollectSkuProdbatch record);

    PdmsDriverSelfCollectSkuProdbatch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsDriverSelfCollectSkuProdbatch record);

    int updateByPrimaryKey(PdmsDriverSelfCollectSkuProdbatch record);

    int updateBatch(List<PdmsDriverSelfCollectSkuProdbatch> list);

    int batchInsert(@Param("list") List<PdmsDriverSelfCollectSkuProdbatch> list);
}