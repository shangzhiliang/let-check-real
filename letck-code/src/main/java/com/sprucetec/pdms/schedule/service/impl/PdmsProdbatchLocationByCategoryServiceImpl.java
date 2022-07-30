package com.sprucetec.pdms.schedule.service.impl;

import javax.annotation.Resource;
import com.mapper.base.PdmsProdbatchLocationByCategoryMapper;
import com.domain.base.PdmsProdbatchLocationByCategory;
import com.sprucetec.pdms.schedule.service.PdmsProdbatchLocationByCategoryService;
import org.springframework.stereotype.Service;

/**
 * @ClassName PdmsProdbatchLocationByCategoryServiceImpl
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:57
 * @Version v1.0
 */
@Service
public class PdmsProdbatchLocationByCategoryServiceImpl implements PdmsProdbatchLocationByCategoryService{

    @Resource
    private PdmsProdbatchLocationByCategoryMapper pdmsProdbatchLocationByCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsProdbatchLocationByCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsProdbatchLocationByCategory record) {
        return pdmsProdbatchLocationByCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(PdmsProdbatchLocationByCategory record) {
        return pdmsProdbatchLocationByCategoryMapper.insertSelective(record);
    }

    @Override
    public PdmsProdbatchLocationByCategory selectByPrimaryKey(Long id) {
        return pdmsProdbatchLocationByCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsProdbatchLocationByCategory record) {
        return pdmsProdbatchLocationByCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsProdbatchLocationByCategory record) {
        return pdmsProdbatchLocationByCategoryMapper.updateByPrimaryKey(record);
    }

}
