package com.sprucetec.pdms.schedule.service.impl;

import com.sprucetec.pdms.schedule.service.PdmsDriverSelfCollectRecordService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.schedule.PdmsDriverSelfCollectRecord;
import java.util.List;
import com.mapper.schedule.PdmsDriverSelfCollectRecordMapper;

@Service
public class PdmsDriverSelfCollectRecordServiceImpl implements PdmsDriverSelfCollectRecordService {

    @Resource
    private PdmsDriverSelfCollectRecordMapper pdmsDriverSelfCollectRecordMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsDriverSelfCollectRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsDriverSelfCollectRecord record) {
        return pdmsDriverSelfCollectRecordMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsDriverSelfCollectRecord record) {
        return pdmsDriverSelfCollectRecordMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsDriverSelfCollectRecord record) {
        return pdmsDriverSelfCollectRecordMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsDriverSelfCollectRecord record) {
        return pdmsDriverSelfCollectRecordMapper.insertSelective(record);
    }

    @Override
    public PdmsDriverSelfCollectRecord selectByPrimaryKey(Long id) {
        return pdmsDriverSelfCollectRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsDriverSelfCollectRecord record) {
        return pdmsDriverSelfCollectRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsDriverSelfCollectRecord record) {
        return pdmsDriverSelfCollectRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsDriverSelfCollectRecord> list) {
        return pdmsDriverSelfCollectRecordMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsDriverSelfCollectRecord> list) {
        return pdmsDriverSelfCollectRecordMapper.batchInsert(list);
    }

}




