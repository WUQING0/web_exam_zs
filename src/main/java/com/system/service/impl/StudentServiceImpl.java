package com.system.service.impl;

import com.system.mapper.StudentMapper;

import com.system.po.Student;
import com.system.po.StudentCustom;
import com.system.po.StudentExample;
import com.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findAll() throws Exception {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria=studentExample.createCriteria();
        criteria.andStudentIdIsNotNull();
        return studentMapper.selectByExample(studentExample);
    }
    @Override
    public List<StudentCustom> findByName(String name) throws Exception {
        StudentExample courseExample = new StudentExample ();
        //自定义查询条件
        StudentExample.Criteria criteria = courseExample.createCriteria();

        criteria.andStudentNameLike("%" + name + "%");

        List<Student> list = studentMapper.selectByExample(courseExample);

        List<StudentCustom> studentCustomList = null;

        if (list != null) {
            studentCustomList= new ArrayList<StudentCustom>();
            for (Student c : list) {
                StudentCustom studentCustom = new StudentCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,studentCustom);
                //获取课程名
                Student college = studentMapper.selectByPrimaryKey(c.getStudentId());
                studentCustom.setStudentName(college.getStudentName());

                studentCustomList.add(studentCustom);
            }
        }

        return studentCustomList;
    }
    @Override
    public List<StudentCustom> findByNamet(Integer id) throws Exception {
        StudentExample courseExample = new StudentExample ();
        //自定义查询条件
        StudentExample.Criteria criteria = courseExample.createCriteria();

        criteria.andStudentIdEqualTo(id);

        List<Student> list = studentMapper.selectByExample(courseExample);

        List<StudentCustom> studentCustomList = null;

        if (list != null) {
            studentCustomList= new ArrayList<StudentCustom>();
            for (Student c : list) {
                StudentCustom studentCustom = new StudentCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,studentCustom);
                //获取课程名
                Student college = studentMapper.selectByPrimaryKey(c.getStudentId());
                studentCustom.setStudentName(college.getStudentName());

                studentCustomList.add(studentCustom);
            }
        }

        return studentCustomList;
    }
    @Override
    public void add(StudentCustom studentCustom) throws Exception {
            studentMapper.insert(studentCustom);
    }

    @Override
    public int delete(Integer id) throws Exception {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(StudentCustom studentCustom) throws Exception {
        studentMapper.updateByPrimaryKey(studentCustom);
    }
}
