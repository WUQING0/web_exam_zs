package com.system.service.impl;

import com.system.mapper.ExamXuanzeMapper;
import com.system.po.ExamXuanze;
import com.system.po.ExamXuanzeCustom;
import com.system.po.ExamXuanzeExample;
import com.system.po.LianxiXuanze;
import com.system.service.ExamXuanzeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamXuanzeServiceImpl implements ExamXuanzeService {
    @Autowired
    ExamXuanzeMapper examXuanzeMapper;

    @Override
    public List<ExamXuanze> findByAll() throws Exception {
        ExamXuanzeExample examXuanzeExample=new ExamXuanzeExample();
        ExamXuanzeExample.Criteria criteria=examXuanzeExample.createCriteria();
        criteria.andExamIdIsNotNull();
        return examXuanzeMapper.selectByExample(examXuanzeExample);
    }

    @Override
    public List<ExamXuanzeCustom> findByName(String name) throws Exception {
        ExamXuanzeExample examXuanzeExample = new ExamXuanzeExample ();
        //自定义查询条件
        ExamXuanzeExample.Criteria criteria = examXuanzeExample.createCriteria();

        criteria.andTypeLike("%" + name + "%");

        List<ExamXuanze> list = examXuanzeMapper.selectByExample(examXuanzeExample);

        List<ExamXuanzeCustom> examXuanzeCustomList = null;

        if (list != null) {
            examXuanzeCustomList= new ArrayList<ExamXuanzeCustom>();
            for (ExamXuanze c : list) {
                ExamXuanzeCustom examXuanzeCustom = new ExamXuanzeCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,examXuanzeCustom);
                //获取课程名
                ExamXuanze college = examXuanzeMapper.selectByPrimaryKey(c.getExamId());
                examXuanzeCustom.setExamName(college.getExamName());

                examXuanzeCustomList.add(examXuanzeCustom);
            }
        }

        return examXuanzeCustomList;
    }

    @Override
    public int deleteById(Integer id) throws Exception {
        return examXuanzeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(ExamXuanzeCustom examXuanzeCustom) throws Exception {
        examXuanzeMapper.updateByPrimaryKey(examXuanzeCustom);
    }

    @Override
    public void add(ExamXuanzeCustom examXuanzeCustom) throws Exception {
        examXuanzeMapper.insert(examXuanzeCustom);
    }
}
