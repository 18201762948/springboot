package com.springboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Pactera on 2017/4/5.
 */
public class BaseService<E,R,I extends Serializable> {

    @Autowired
    BaseMapper<E,R,I> baseMapper;

    public int countByExample(E example){return baseMapper.countByExample(example);}

    public int deleteByExample(E example){return baseMapper.deleteByExample(example);}

    public int deleteByPrimaryKey(I id){return baseMapper.deleteByPrimaryKey(id);}

    public int insert(R record){return baseMapper.insert(record);}

    public int insertSelective(R record){return baseMapper.insertSelective(record);}

    public List<R> selectByExample(E example){return baseMapper.selectByExample(example);}

    public PageInfo<R> selectPage(E example,int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<R> rs = baseMapper.selectByExample(example);
        PageInfo<R> pageInfo = new PageInfo<R>(rs);
        return pageInfo;
    }

    public R selectByPrimaryKey(I id){return baseMapper.selectByPrimaryKey(id);}

    public int updateByExampleSelective(R record,E example){return baseMapper.updateByExampleSelective(record,example);}

    public int updateByExample(R record, E example){return baseMapper.updateByExample(record,example);}

    public int updateByPrimaryKeySelective(R record){return baseMapper.updateByPrimaryKeySelective(record);}

    public int updateByPrimaryKey(R record){return baseMapper.updateByPrimaryKeySelective(record);}

}
