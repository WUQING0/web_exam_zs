package com.system.mapper;

import com.system.po.LianxiTest;
import com.system.po.LianxiTestExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface LianxiTestMapper {
    int countByExample(LianxiTestExample example);

    int deleteByExample(LianxiTestExample example);

    int deleteByPrimaryKey(Integer stuId);

    void insert(LianxiTest record);

    int insertSelective(LianxiTest record);

    List<LianxiTest> selectByExample(LianxiTestExample example);

    LianxiTest selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") LianxiTest record, @Param("example") LianxiTestExample example);

    int updateByExample(@Param("record") LianxiTest record, @Param("example") LianxiTestExample example);

    int updateByPrimaryKeySelective(LianxiTest record);

    int updateByPrimaryKey(LianxiTest record);
}