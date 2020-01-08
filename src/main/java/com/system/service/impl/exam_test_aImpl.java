package com.system.service.impl;

import com.system.mapper.ExamTestAMapper;
import com.system.po.ExamTestACustom;
import com.system.service.Exam_test_a;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class exam_test_aImpl implements Exam_test_a {
    @Autowired
    ExamTestAMapper examTestAMapper;

    @Override
    public void add(ExamTestACustom examTestACustom) throws Exception {
        examTestAMapper.insert(examTestACustom);
    }
}
