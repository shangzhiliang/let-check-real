package com.sprucetec.pdms.schedule.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.base.PdmsProdbatchLocationBySsuMapper;
import com.domain.base.PdmsProdbatchLocationBySsu;
import com.sprucetec.pdms.schedule.service.PdmsProdbatchLocationBySsuService;
/**
 * @ClassName PdmsProdbatchLocationBySsuServiceImpl
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 19:00
 * @Version v1.0
 */
@Service
public class PdmsProdbatchLocationBySsuServiceImpl implements PdmsProdbatchLocationBySsuService{

    @Resource
    private PdmsProdbatchLocationBySsuMapper pdmsProdbatchLocationBySsuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pdmsProdbatchLocationBySsuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PdmsProdbatchLocationBySsu record) {
        return pdmsProdbatchLocationBySsuMapper.insert(record);
    }

    @Override
    public int insertSelective(PdmsProdbatchLocationBySsu record) {
        return pdmsProdbatchLocationBySsuMapper.insertSelective(record);
    }

    @Override
    public PdmsProdbatchLocationBySsu selectByPrimaryKey(Long id) {
        return pdmsProdbatchLocationBySsuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PdmsProdbatchLocationBySsu record) {
        return pdmsProdbatchLocationBySsuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PdmsProdbatchLocationBySsu record) {
        return pdmsProdbatchLocationBySsuMapper.updateByPrimaryKey(record);
    }

}
