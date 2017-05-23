package com.springboot.mapper;

import com.springboot.domain.Test;
import com.springboot.domain.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int countByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int deleteByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer testId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    List<Test> selectByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    Test selectByPrimaryKey(Integer testId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST_T
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Test record);
}