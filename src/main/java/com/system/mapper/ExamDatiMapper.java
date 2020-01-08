package com.system.mapper;

import com.system.po.ExamDati;
import com.system.po.ExamDatiExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ExamDatiMapper {
    int countByExample(ExamDatiExample example);

    int deleteByExample(ExamDatiExample example);

    int deleteByPrimaryKey(Integer examId);

    void insert(ExamDati record);

    int insertSelective(ExamDati record);

    List<ExamDati> selectByExample(ExamDatiExample example);

    ExamDati selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") ExamDati record, @Param("example") ExamDatiExample example);

    int updateByExample(@Param("record") ExamDati record, @Param("example") ExamDatiExample example);

    int updateByPrimaryKeySelective(ExamDati record);

    int updateByPrimaryKey(ExamDati record);
}