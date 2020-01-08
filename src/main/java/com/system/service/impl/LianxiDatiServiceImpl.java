package com.system.service.impl;

import com.system.mapper.LianxiDatiMapper;
import com.system.po.LianxiDati;
import com.system.po.LianxiDatiCustom;
import com.system.po.LianxiDatiExample;
import com.system.po.LianxiXuanzeCustom;
import com.system.service.LianxiDatiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LianxiDatiServiceImpl implements LianxiDatiService {

    @Autowired
    LianxiDatiMapper lianxiDatiMapper;

    @Override
    public List<LianxiDati> findByAll() throws Exception {
        LianxiDatiExample lianxiDatiExample=new LianxiDatiExample();
        LianxiDatiExample.Criteria criteria=lianxiDatiExample.createCriteria();
        criteria.andLianxiIdIsNotNull();
        return lianxiDatiMapper.selectByExample(lianxiDatiExample);
    }

    @Override
    public List<LianxiDatiCustom> findByName(String name) throws Exception {
        LianxiDatiExample lianxiDatiExample = new LianxiDatiExample ();
        //自定义查询条件
        LianxiDatiExample.Criteria criteria = lianxiDatiExample.createCriteria();

        criteria.andTypeLike("%" + name + "%");

        List<LianxiDati> list = lianxiDatiMapper.selectByExample(lianxiDatiExample);

        List<LianxiDatiCustom> lianxiDatiCustomList = null;

        if (list != null) {
            lianxiDatiCustomList= new ArrayList<LianxiDatiCustom>();
            for (LianxiDati c : list) {
                LianxiDatiCustom lianxiDatiCustom = new LianxiDatiCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,lianxiDatiCustom);
                //获取课程名
                LianxiDati college = lianxiDatiMapper.selectByPrimaryKey(c.getLianxiId());
                lianxiDatiCustom.setLianxiName(college.getLianxiName());

                lianxiDatiCustomList.add(lianxiDatiCustom);
            }
        }

        return lianxiDatiCustomList;
    }

    @Override
    public int deleteById(Integer id) throws Exception {
        return lianxiDatiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(LianxiDatiCustom lianxiDatiCustom) throws Exception {
        lianxiDatiMapper.updateByPrimaryKey(lianxiDatiCustom);
    }

    @Override
    public void add(LianxiDatiCustom lianxiDatiCustom) throws Exception {
        lianxiDatiMapper.insert(lianxiDatiCustom);
    }
}
