package com.sprucetec.pdms.schedule.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.schedule.NaviaOrderItemBindRelationshipMapper;
import com.domain.schedule.NaviaOrderItemBindRelationship;
import com.sprucetec.pdms.schedule.service.NaviaOrderItemBindRelationshipService;import java.util.List;

/**
 * @ClassName NaviaOrderItemBindRelationshipServiceImpl
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:34
 * @Version v1.0
 */
@Service
public class NaviaOrderItemBindRelationshipServiceImpl implements NaviaOrderItemBindRelationshipService {

    @Resource
    private NaviaOrderItemBindRelationshipMapper naviaOrderItemBindRelationshipMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return naviaOrderItemBindRelationshipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(NaviaOrderItemBindRelationship record) {
        return naviaOrderItemBindRelationshipMapper.insert(record);
    }

    @Override
    public int insertSelective(NaviaOrderItemBindRelationship record) {
        return naviaOrderItemBindRelationshipMapper.insertSelective(record);
    }

    @Override
    public NaviaOrderItemBindRelationship selectByPrimaryKey(Long id) {
        return naviaOrderItemBindRelationshipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(NaviaOrderItemBindRelationship record) {
        return naviaOrderItemBindRelationshipMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(NaviaOrderItemBindRelationship record) {
        return naviaOrderItemBindRelationshipMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrUpdate(NaviaOrderItemBindRelationship record) {
        return naviaOrderItemBindRelationshipMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(NaviaOrderItemBindRelationship record) {
        return naviaOrderItemBindRelationshipMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int updateBatch(List<NaviaOrderItemBindRelationship> list) {
        return naviaOrderItemBindRelationshipMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<NaviaOrderItemBindRelationship> list) {
        return naviaOrderItemBindRelationshipMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<NaviaOrderItemBindRelationship> list) {
        return naviaOrderItemBindRelationshipMapper.batchInsert(list);
    }
}



