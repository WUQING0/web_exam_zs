package com.system.mapper;

import com.system.po.LianxiXuanze;
import com.system.po.LianxiXuanzeExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface LianxiXuanzeMapper {
    int countByExample(LianxiXuanzeExample example);

    int deleteByExample(LianxiXuanzeExample example);

    int deleteByPrimaryKey(Integer lianxiId);

    void insert(LianxiXuanze record);

    int insertSelective(LianxiXuanze record);

    List<LianxiXuanze> selectByExample(LianxiXuanzeExample example);

    LianxiXuanze selectByPrimaryKey(Integer lianxiId);

    int updateByExampleSelective(@Param("record") LianxiXuanze record, @Param("example") LianxiXuanzeExample example);

    int updateByExample(@Param("record") LianxiXuanze record, @Param("example") LianxiXuanzeExample example);

    int updateByPrimaryKeySelective(LianxiXuanze record);

    int updateByPrimaryKey(LianxiXuanze record);
}