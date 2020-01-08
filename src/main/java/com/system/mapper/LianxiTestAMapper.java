package com.system.mapper;

import com.system.po.LianxiTestA;
import com.system.po.LianxiTestAExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LianxiTestAMapper {
    int countByExample(LianxiTestAExample example);

    int deleteByExample(LianxiTestAExample example);

    int deleteByPrimaryKey(Integer examId);

    int insert(LianxiTestA record);

    int insertSelective(LianxiTestA record);

    List<LianxiTestA> selectByExample(LianxiTestAExample example);

    LianxiTestA selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") LianxiTestA record, @Param("example") LianxiTestAExample example);

    int updateByExample(@Param("record") LianxiTestA record, @Param("example") LianxiTestAExample example);

    int updateByPrimaryKeySelective(LianxiTestA record);

    int updateByPrimaryKey(LianxiTestA record);
}