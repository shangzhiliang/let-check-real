package com.mapper.base;

import com.domain.schedule.PdmsDriverSelfCollectRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmsDriverSelfCollectRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PdmsDriverSelfCollectRecord record);

    int insertOrUpdate(PdmsDriverSelfCollectRecord record);

    int insertOrUpdateSelective(PdmsDriverSelfCollectRecord record);

    int insertSelective(PdmsDriverSelfCollectRecord record);

    PdmsDriverSelfCollectRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PdmsDriverSelfCollectRecord record);

    int updateByPrimaryKey(PdmsDriverSelfCollectRecord record);

    int updateBatch(List<PdmsDriverSelfCollectRecord> list);

    int batchInsert(@Param("list") List<PdmsDriverSelfCollectRecord> list);
}