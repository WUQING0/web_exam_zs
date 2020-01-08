package com.system.service.impl;

import com.system.mapper.LianxiXuanzeMapper;
import com.system.po.LianxiXuanze;
import com.system.po.LianxiXuanzeCustom;
import com.system.po.LianxiXuanzeExample;
import com.system.service.LianxiXuanzeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LianxiXuanzeServiceImpl implements LianxiXuanzeService {

    @Autowired
    LianxiXuanzeMapper lianxiXuanzeMapper;

    @Override
    public List<LianxiXuanze> findByAll() throws Exception {
        LianxiXuanzeExample lianxiXuanzeExample=new LianxiXuanzeExample();
        LianxiXuanzeExample.Criteria criteria=lianxiXuanzeExample.createCriteria();
        criteria.andLianxiIdIsNotNull();
        return lianxiXuanzeMapper.selectByExample(lianxiXuanzeExample);
    }

    @Override
    public List<LianxiXuanzeCustom> findByName(String type) throws Exception {
        LianxiXuanzeExample lianxiXuanzeExample = new LianxiXuanzeExample ();
        //自定义查询条件
        LianxiXuanzeExample.Criteria criteria = lianxiXuanzeExample.createCriteria();

        criteria.andTypeLike("%" + type + "%");
        List<LianxiXuanze> list = lianxiXuanzeMapper.selectByExample(lianxiXuanzeExample);

        List<LianxiXuanzeCustom> lianxiXuanzeCustomList = null;

        if (list != null) {
            lianxiXuanzeCustomList= new ArrayList<LianxiXuanzeCustom>();
            for (LianxiXuanze c : list) {
                LianxiXuanzeCustom lianxiXuanzeCustom = new LianxiXuanzeCustom();
                //类拷贝
                org.springframework.beans.BeanUtils.copyProperties(c,lianxiXuanzeCustom);
                //获取课程名
               LianxiXuanze college = lianxiXuanzeMapper.selectByPrimaryKey(c.getLianxiId());
                lianxiXuanzeCustom.setLianxiName(college.getLianxiName());

                lianxiXuanzeCustomList.add(lianxiXuanzeCustom);
            }
        }

        return lianxiXuanzeCustomList;
    }

    @Override
    public int deleteById(Integer id) throws Exception {
        return lianxiXuanzeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception {
        lianxiXuanzeMapper.updateByPrimaryKey(lianxiXuanzeCustom);
    }

    @Override
    public void add(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception {
        lianxiXuanzeMapper.insert(lianxiXuanzeCustom);
    }
}
