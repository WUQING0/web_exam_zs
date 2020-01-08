package com.system.service.impl;

import com.system.mapper.ExamTestAMapper;
import com.system.mapper.ExamTestMapper;
import com.system.po.ExamTestA;
import com.system.po.ExamTestAExample;
import com.system.po.ExamTestCustom;
import com.system.service.tchCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class tchCheckImpl implements tchCheck {
    @Autowired
    ExamTestAMapper examTestAMapper;

    @Autowired
    ExamTestMapper examTestMapper;

//老师发布成绩
    @Override
    public List<ExamTestA> findAll() throws Exception {
        ExamTestAExample examExample =new ExamTestAExample();
        ExamTestAExample.Criteria criteria=examExample.createCriteria();
        criteria.andStuIdIsNotNull();
        return examTestAMapper.selectByExample(examExample);
    }

    @Override
    public void add(ExamTestCustom examTestCustom) throws Exception {
        examTestMapper.insert(examTestCustom);
    }
}
