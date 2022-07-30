package com.sprucetec.pdms.base.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.domain.base.PdmsDriverSelfCollectSkuConfig;
import com.mapper.base.PdmsDriverSelfCollectSkuConfigMapper;
import com.sprucetec.pdms.base.service.PdmsDriverSelfCollectSkuConfigService;
@Service
public class PdmsDriverSelfCollectSkuConfigServiceImpl implements PdmsDriverSelfCollectSkuConfigService{

    @Resource
    private PdmsDriverSelfCollectSkuConfigMapper pdmsDriverSelfCollectSkuConfigMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsDriverSelfCollectSkuConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsDriverSelfCollectSkuConfig record) {
        return pdmsDriverSelfCollectSkuConfigMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PdmsDriverSelfCollectSkuConfig record) {
        return pdmsDriverSelfCollectSkuConfigMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PdmsDriverSelfCollectSkuConfig record) {
        return pdmsDriverSelfCollectSkuConfigMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PdmsDriverSelfCollectSkuConfig record) {
        return pdmsDriverSelfCollectSkuConfigMapper.insertSelective(record);
    }

    @Override
    public PdmsDriverSelfCollectSkuConfig selectByPrimaryKey(Long id) {
        return pdmsDriverSelfCollectSkuConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsDriverSelfCollectSkuConfig record) {
        return pdmsDriverSelfCollectSkuConfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsDriverSelfCollectSkuConfig record) {
        return pdmsDriverSelfCollectSkuConfigMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PdmsDriverSelfCollectSkuConfig> list) {
        return pdmsDriverSelfCollectSkuConfigMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PdmsDriverSelfCollectSkuConfig> list) {
        return pdmsDriverSelfCollectSkuConfigMapper.batchInsert(list);
    }

}
