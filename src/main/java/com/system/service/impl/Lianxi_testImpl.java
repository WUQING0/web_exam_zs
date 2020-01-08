package com.system.service.impl;

import com.system.mapper.LianxiTestAMapper;
import com.system.mapper.LianxiTestMapper;
import com.system.po.LianxiTestA;
import com.system.po.LianxiTestACustom;
import com.system.po.LianxiTestAExample;
import com.system.po.LianxiTestCustom;
import com.system.service.Lianxi_test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Lianxi_testImpl implements Lianxi_test {

    @Autowired
    LianxiTestAMapper lianxiTestAMapper;

    @Autowired
    LianxiTestMapper lianxiTestMapper;
    @Override
    public List<LianxiTestACustom> findByName(int id) throws Exception {
        LianxiTestAExample lianxiTestAExample = new LianxiTestAExample ();
        //自定义查询条件
        LianxiTestAExample.Criteria criteria = lianxiTestAExample.createCriteria();

        criteria.andStuIdEqualTo(id);

        List<LianxiTestA> list = lianxiTestAMapper.selectByExample(lianxiTestAExample);

        List<LianxiTestACustom> lianxiTestACustomList = null;

        if (list != null) {
            lianxiTestACustomList= new ArrayList<LianxiTestACustom>();
            for (LianxiTestA c : list) {
                LianxiTestACustom lianxiTestACustom = new LianxiTestACustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,lianxiTestACustom);
                //获取课程名
                LianxiTestA college = lianxiTestAMapper.selectByPrimaryKey(c.getExamId());
                lianxiTestACustom.setStuName(college.getStuName());

                lianxiTestACustomList.add(lianxiTestACustom);
            }
        }

        return lianxiTestACustomList;
    }

    @Override
    public void add(LianxiTestCustom lianxiTestCustom) throws Exception {
         lianxiTestMapper.insert(lianxiTestCustom);
    }
}
