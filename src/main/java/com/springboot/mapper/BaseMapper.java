package com.springboot.mapper;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Pactera on 2017/4/5.
 */
public interface BaseMapper<E,R,I extends Serializable> {
    int countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(I Id);

    int insert(R record);

    int insertSelective(R record);

    List<R> selectByExample(E example);

    R selectByPrimaryKey(I Id);

    int updateByExampleSelective(@Param("record") R record, @Param("example") E example);

    int updateByExample(@Param("record") R record, @Param("example") E example);

    int updateByPrimaryKeySelective(R record);

    int updateByPrimaryKey(R record);
}
