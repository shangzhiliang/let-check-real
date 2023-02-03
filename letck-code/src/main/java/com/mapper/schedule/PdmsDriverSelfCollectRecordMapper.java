package com.mapper.schedule;

import com.domain.schedule.PdmsDriverSelfCollectRecord;
import java.util.List;
import org.springframework.data.repository.query.Param;

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