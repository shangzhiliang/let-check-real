package com.pdms.base.navia.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pdms.base.mapper.DistArrangeOccupyLineTaskMapper;
import com.pdms.base.model.DistArrangeOccupyLineTask;
import com.pdms.base.navia.service.DistArrangeOccupyLineTaskService;

@Service
public class DistArrangeOccupyLineTaskServiceImpl implements DistArrangeOccupyLineTaskService {

    @Resource
    private DistArrangeOccupyLineTaskMapper distArrangeOccupyLineTaskMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return distArrangeOccupyLineTaskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DistArrangeOccupyLineTask record) {
        return distArrangeOccupyLineTaskMapper.insert(record);
    }

    @Override
    public int insertSelective(DistArrangeOccupyLineTask record) {
        return distArrangeOccupyLineTaskMapper.insertSelective(record);
    }

    @Override
    public DistArrangeOccupyLineTask selectByPrimaryKey(Long id) {
        return distArrangeOccupyLineTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DistArrangeOccupyLineTask record) {
        return distArrangeOccupyLineTaskMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DistArrangeOccupyLineTask record) {
        return distArrangeOccupyLineTaskMapper.updateByPrimaryKey(record);
    }

}



