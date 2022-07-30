package com.sprucetec.pdms.base.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.base.PdmsDriverSelfCollectSkuProdbatchMapper;
import com.domain.base.PdmsDriverSelfCollectSkuProdbatch;
import java.util.List;
import com.sprucetec.pdms.base.service.PdmsDriverSelfCollectSkuProdbatchService;
@Service
public class PdmsDriverSelfCollectSkuProdbatchServiceImpl implements PdmsDriverSelfCollectSkuProdbatchService{

    @Resource
    private PdmsDriverSelfCollectSkuProdbatchMapper pdmsDriverSelfCollectSkuProdbatchMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsDriverSelfCollectSkuProdbatch record) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsDriverSelfCollectSkuProdbatch record) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsDriverSelfCollectSkuProdbatch record) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsDriverSelfCollectSkuProdbatch record) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.insertSelective(record);
    }

    @Override
    public PdmsDriverSelfCollectSkuProdbatch selectByPrimaryKey(Long id) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsDriverSelfCollectSkuProdbatch record) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsDriverSelfCollectSkuProdbatch record) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsDriverSelfCollectSkuProdbatch> list) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsDriverSelfCollectSkuProdbatch> list) {
        return pdmsDriverSelfCollectSkuProdbatchMapper.batchInsert(list);
    }

}
