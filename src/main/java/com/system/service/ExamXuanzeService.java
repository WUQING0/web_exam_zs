package com.system.service;

import com.system.po.ExamXuanze;
import com.system.po.ExamXuanzeCustom;

import java.util.List;

public interface ExamXuanzeService {
    List<ExamXuanze> findByAll() throws Exception;
    List<ExamXuanzeCustom> findByName(String name) throws  Exception;
    int deleteById(Integer id) throws Exception;
    void update(ExamXuanzeCustom examXuanzeCustom) throws Exception;
    void add(ExamXuanzeCustom examXuanzeCustom) throws Exception;
}
