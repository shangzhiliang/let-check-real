package com.sprucetec.pdms.schedule.service.impl;

import com.sprucetec.pdms.schedule.service.PdmsProdbatchLocationBySkuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.base.PdmsProdbatchLocationBySku;
import com.mapper.base.PdmsProdbatchLocationBySkuMapper;

/**
 * @ClassName PdmsProdbatchLocationBySkuServiceImpl
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:59
 * @Version v1.0
 */
@Service
public class PdmsProdbatchLocationBySkuServiceImpl implements PdmsProdbatchLocationBySkuService {

    @Resource
    private PdmsProdbatchLocationBySkuMapper pdmsProdbatchLocationBySkuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsProdbatchLocationBySkuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsProdbatchLocationBySku record) {
        return pdmsProdbatchLocationBySkuMapper.insert(record);
    }

    @Override
    public int insertSelective(PdmsProdbatchLocationBySku record) {
        return pdmsProdbatchLocationBySkuMapper.insertSelective(record);
    }

    @Override
    public PdmsProdbatchLocationBySku selectByPrimaryKey(Long id) {
        return pdmsProdbatchLocationBySkuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsProdbatchLocationBySku record) {
        return pdmsProdbatchLocationBySkuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsProdbatchLocationBySku record) {
        return pdmsProdbatchLocationBySkuMapper.updateByPrimaryKey(record);
    }

}
