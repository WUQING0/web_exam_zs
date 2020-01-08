package com.system.mapper;

import java.util.List;

import com.system.po.Student;
import com.system.po.StudentExample;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer studentId);

    void insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    Student updateByExample(@Param("record") Student record);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}