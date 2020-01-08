package com.system.mapper;

import com.system.po.ExamTest;
import com.system.po.ExamTestExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ExamTestMapper {
    int countByExample(ExamTestExample example);

    int deleteByExample(ExamTestExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(ExamTest record);

    int insertSelective(ExamTest record);

    List<ExamTest> selectByExample(ExamTestExample example);

    ExamTest selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") ExamTest record, @Param("example") ExamTestExample example);

    int updateByExample(@Param("record") ExamTest record, @Param("example") ExamTestExample example);

    int updateByPrimaryKeySelective(ExamTest record);

    int updateByPrimaryKey(ExamTest record);
}