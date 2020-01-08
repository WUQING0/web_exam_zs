package com.system.mapper;

import com.system.po.ExamTestA;
import com.system.po.ExamTestAExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ExamTestAMapper {
    int countByExample(ExamTestAExample example);

    int deleteByExample(ExamTestAExample example);

    int deleteByPrimaryKey(Integer examId);

    int insert(ExamTestA record);

    int insertSelective(ExamTestA record);

    List<ExamTestA> selectByExample(ExamTestAExample example);

    ExamTestA selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") ExamTestA record, @Param("example") ExamTestAExample example);

    int updateByExample(@Param("record") ExamTestA record, @Param("example") ExamTestAExample example);

    int updateByPrimaryKeySelective(ExamTestA record);

    int updateByPrimaryKey(ExamTestA record);
}