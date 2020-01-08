package com.system.service;

import com.system.po.ExamDati;
import com.system.po.ExamDatiCustom;

import java.util.List;

public interface ExamDatiService {
    List<ExamDati> findByAll() throws Exception;
    List<ExamDatiCustom> findByName(String name) throws  Exception;
    int deleteById(Integer id) throws Exception;
    void update(ExamDatiCustom examDatiCustom) throws Exception;
    void add(ExamDatiCustom examDatiCustom) throws Exception;
}
