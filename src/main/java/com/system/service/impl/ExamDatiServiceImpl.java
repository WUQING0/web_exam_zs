package com.system.service.impl;

import com.system.mapper.ExamDatiMapper;
import com.system.po.ExamDati;
import com.system.po.ExamDatiCustom;
import com.system.po.ExamDatiExample;
import com.system.service.ExamDatiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamDatiServiceImpl implements ExamDatiService {

    @Autowired
    ExamDatiMapper examDatiMapper;
    @Override
    public List<ExamDati> findByAll() throws Exception {
        ExamDatiExample examDatiExample=new ExamDatiExample();
        ExamDatiExample.Criteria criteria=examDatiExample.createCriteria();
        criteria.andExamIdIsNotNull();
        return examDatiMapper.selectByExample(examDatiExample);
    }

    @Override
    public List<ExamDatiCustom> findByName(String name) throws Exception {
        ExamDatiExample examDatiExample = new ExamDatiExample ();
        //自定义查询条件
        ExamDatiExample.Criteria criteria = examDatiExample.createCriteria();

        criteria.andTypeLike("%" + name + "%");

        List<ExamDati> list = examDatiMapper.selectByExample(examDatiExample);

        List<ExamDatiCustom> examDatiCustomList = null;

        if (list != null) {
            examDatiCustomList= new ArrayList<ExamDatiCustom>();
            for (ExamDati c : list) {
                ExamDatiCustom examDatiCustom = new ExamDatiCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,examDatiCustom);
                //获取课程名
                ExamDati college = examDatiMapper.selectByPrimaryKey(c.getExamId());
                examDatiCustom.setExamName(college.getExamName());

                examDatiCustomList.add(examDatiCustom);
            }
        }

        return examDatiCustomList;
    }

    @Override
    public int deleteById(Integer id) throws Exception {
        return examDatiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(ExamDatiCustom examDatiCustom) throws Exception {
        examDatiMapper.updateByPrimaryKey(examDatiCustom);
    }

    @Override
    public void add(ExamDatiCustom examDatiCustom) throws Exception {
        examDatiMapper.insert(examDatiCustom);
    }
}
