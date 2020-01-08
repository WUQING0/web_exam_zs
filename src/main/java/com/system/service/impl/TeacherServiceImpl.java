package com.system.service.impl;

import com.system.mapper.TeacherMapper;
import com.system.po.Teacher;
import com.system.po.TeacherCustom;
import com.system.po.TeacherExample;
import com.system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findByAll() throws Exception {
        TeacherExample teacherExample =new TeacherExample();
        TeacherExample.Criteria criteria=teacherExample.createCriteria();
        criteria.andTeacherIdIsNotNull();
        return teacherMapper.selectByExample(teacherExample);
    }

    @Override
    public List<TeacherCustom> findByName(String name) throws Exception {
        TeacherExample courseExample = new TeacherExample ();
        //自定义查询条件
        TeacherExample .Criteria criteria = courseExample.createCriteria();

        criteria.andTeacherNameLike("%" + name + "%");

        List<Teacher> list = teacherMapper.selectByExample(courseExample);

        List<TeacherCustom> teacherCustomList = null;

        if (list != null) {
            teacherCustomList = new ArrayList<TeacherCustom>();
            for (Teacher c : list) {
                TeacherCustom teacherCustom = new TeacherCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,teacherCustom);
                //获取课程名
                Teacher college = teacherMapper.selectByPrimaryKey(c.getTeacherId());
                teacherCustom.setTeacherName(college.getTeacherName());

                teacherCustomList.add(teacherCustom);
            }
        }

        return teacherCustomList;
    }
    @Override
    public List<TeacherCustom> findByNamet(Integer id) throws Exception {
        TeacherExample courseExample = new TeacherExample ();
        //自定义查询条件
        TeacherExample .Criteria criteria = courseExample.createCriteria();

        criteria.andTeacherIdEqualTo(id);

        List<Teacher> list = teacherMapper.selectByExample(courseExample);

        List<TeacherCustom> teacherCustomList = null;

        if (list != null) {
            teacherCustomList = new ArrayList<TeacherCustom>();
            for (Teacher c : list) {
                TeacherCustom teacherCustom = new TeacherCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,teacherCustom);
                //获取课程名
                Teacher college = teacherMapper.selectByPrimaryKey(c.getTeacherId());
                teacherCustom.setTeacherName(college.getTeacherName());

                teacherCustomList.add(teacherCustom);
            }
        }

        return teacherCustomList;
    }

    @Override
    public int deleteById(Integer id) throws Exception {
            return teacherMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void update(TeacherCustom teacherCustom) throws Exception {
                teacherMapper.updateByPrimaryKey(teacherCustom);
    }

    @Override
    public void add(TeacherCustom teacherCustom) throws Exception {
            teacherMapper.insert(teacherCustom);

    }
}
