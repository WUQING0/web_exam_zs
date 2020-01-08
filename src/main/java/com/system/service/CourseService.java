package com.system.service;

import com.system.po.Course;
import com.system.po.CourseCustom;
import com.system.po.Student;

import java.util.List;

public interface CourseService {
    List<Course> findByAll() throws Exception;
    List<CourseCustom> findByName(String name) throws  Exception;
    int deleteById(Integer id) throws Exception;
    void update(CourseCustom courseCustom) throws Exception;
    void add(CourseCustom courseCustom) throws Exception;
}
