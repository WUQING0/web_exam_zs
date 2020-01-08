package com.system.mapper;

import com.system.po.LianxiDati;
import com.system.po.LianxiDatiExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface LianxiDatiMapper {
    int countByExample(LianxiDatiExample example);

    int deleteByExample(LianxiDatiExample example);

    int deleteByPrimaryKey(Integer lianxiId);

    void insert(LianxiDati record);

    int insertSelective(LianxiDati record);

    List<LianxiDati> selectByExample(LianxiDatiExample example);

    LianxiDati selectByPrimaryKey(Integer lianxiId);

    int updateByExampleSelective(@Param("record") LianxiDati record, @Param("example") LianxiDatiExample example);

    int updateByExample(@Param("record") LianxiDati record, @Param("example") LianxiDatiExample example);

    int updateByPrimaryKeySelective(LianxiDati record);

    int updateByPrimaryKey(LianxiDati record);
}