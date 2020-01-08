package com.system.service;

import com.system.po.Teacher;
import com.system.po.TeacherCustom;

import java.util.List;

public interface TeacherService {
    List<Teacher> findByAll() throws Exception;
    List<TeacherCustom> findByName(String name) throws  Exception;
    int deleteById(Integer id) throws Exception;
    void update(TeacherCustom teacherCustom) throws Exception;
    void add(TeacherCustom teacherCustom) throws Exception;
    List<TeacherCustom> findByNamet(Integer id) throws  Exception;
}
