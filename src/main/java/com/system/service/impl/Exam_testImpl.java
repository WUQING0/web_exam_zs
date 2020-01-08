package com.system.service.impl;

import com.system.mapper.ExamTestMapper;
import com.system.po.ExamTest;
import com.system.po.ExamTestCustom;
import com.system.po.ExamTestExample;
import com.system.service.Exam_test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Exam_testImpl implements Exam_test {

    @Autowired
   ExamTestMapper examTestMapper;
    @Override
    public List<ExamTestCustom> findByName(int id) throws Exception {
        ExamTestExample examTestExample = new ExamTestExample ();
        //自定义查询条件
        ExamTestExample.Criteria criteria = examTestExample.createCriteria();

        criteria.andStuIdEqualTo(id);

        List<ExamTest> list = examTestMapper.selectByExample(examTestExample);

        List<ExamTestCustom> examTestCustomList = null;

        if (list != null) {
            examTestCustomList= new ArrayList<ExamTestCustom>();
            for (ExamTest c : list) {
                ExamTestCustom lianxiTestACustom = new ExamTestCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,lianxiTestACustom);
                //获取课程名
                ExamTest college = examTestMapper.selectByPrimaryKey(c.getStuId());
                lianxiTestACustom.setStuName(college.getStuName());

                examTestCustomList.add(lianxiTestACustom);
            }
        }

        return examTestCustomList;
    }
    @Override
    public List<ExamTest> findByAll() throws Exception {
        ExamTestExample examTestExample =new ExamTestExample();
        ExamTestExample.Criteria criteria=examTestExample.createCriteria();
        criteria.andStuIdIsNotNull();
        return examTestMapper.selectByExample(examTestExample);
    }
}
