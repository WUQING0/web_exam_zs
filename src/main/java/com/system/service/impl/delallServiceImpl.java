package com.system.service.impl;

import com.system.mapper.DelallMapper;
import com.system.service.delallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class delallServiceImpl implements delallService {

    @Autowired
    DelallMapper delallMapper;

    @Override
    public void delall() throws Exception {
        delallMapper.delall();
    }
    @Override
    public void del() throws Exception {
        delallMapper.del();
    }
}
