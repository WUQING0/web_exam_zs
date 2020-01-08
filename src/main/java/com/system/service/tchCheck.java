package com.system.service;

import com.system.po.ExamTestA;
import com.system.po.ExamTestCustom;

import java.util.List;

//查询所有人的成绩
public interface tchCheck {
    List<ExamTestA> findAll() throws Exception;
    void add(ExamTestCustom examTestCustom) throws Exception;
}
