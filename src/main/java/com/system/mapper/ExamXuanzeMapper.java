package com.system.mapper;

import com.system.po.ExamXuanze;
import com.system.po.ExamXuanzeExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ExamXuanzeMapper {
    int countByExample(ExamXuanzeExample example);

    int deleteByExample(ExamXuanzeExample example);

    int deleteByPrimaryKey(Integer examId);

    void insert(ExamXuanze record);

    int insertSelective(ExamXuanze record);

    List<ExamXuanze> selectByExample(ExamXuanzeExample example);

    ExamXuanze selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") ExamXuanze record, @Param("example") ExamXuanzeExample example);

    int updateByExample(@Param("record") ExamXuanze record, @Param("example") ExamXuanzeExample example);

    int updateByPrimaryKeySelective(ExamXuanze record);

    int updateByPrimaryKey(ExamXuanze record);
}