package com.system.service.impl;

import com.system.mapper.CourseMapper;
import com.system.po.Course;
import com.system.po.CourseCustom;
import com.system.po.CourseExample;
import com.system.po.Student;
import com.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> findByAll() throws Exception {
        CourseExample courseExample=new CourseExample();
        CourseExample.Criteria criteria=courseExample.createCriteria();
        criteria.andCourseIdIsNotNull();
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public List<CourseCustom> findByName(String name) throws Exception {
        CourseExample courseExample = new CourseExample ();
        //自定义查询条件
        CourseExample.Criteria criteria = courseExample.createCriteria();

        criteria.andCourseNameLike("%" + name + "%");

        List<Course> list = courseMapper.selectByExample(courseExample);

        List<CourseCustom> courseCustomList = null;

        if (list != null) {
            courseCustomList= new ArrayList<CourseCustom>();
            for (Course c : list) {
                CourseCustom courseCustom = new CourseCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,courseCustom);
                //获取课程名
                Course college = courseMapper.selectByPrimaryKey(c.getCourseId());
                courseCustom.setCourseName(college.getCourseName());

                courseCustomList.add(courseCustom);
            }
        }

        return courseCustomList;


    }

    @Override
    public int deleteById(Integer id) throws Exception {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(CourseCustom courseCustom) throws Exception {
        courseMapper.updateByPrimaryKey(courseCustom);
    }

    @Override
    public void add(CourseCustom courseCustom) throws Exception {
         courseMapper.insert(courseCustom);
    }
}
