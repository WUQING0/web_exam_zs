package com.system.service;

import com.system.po.Student;
import com.system.po.StudentCustom;

import java.util.List;

public interface StudentService {
    List<Student> findAll() throws Exception;
    List<StudentCustom> findByName(String name) throws Exception;
    void add(StudentCustom studentCustom) throws Exception;
    int delete(Integer id) throws Exception;
    void update(StudentCustom studentCustom) throws Exception;
    List<StudentCustom> findByNamet(Integer id) throws Exception;
}
