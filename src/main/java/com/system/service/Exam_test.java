package com.system.service;

import com.system.po.ExamTest;
import com.system.po.ExamTestCustom;

import java.util.List;

public interface Exam_test {
    List<ExamTestCustom> findByName(int id) throws  Exception;
    List<ExamTest> findByAll() throws  Exception;
}
