package com.system.service.impl;

import com.system.mapper.LianxiTestAMapper;
import com.system.po.LianxiTestACustom;
import com.system.service.Lianxi_test_a;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lianxi_test_aImpl implements Lianxi_test_a {
    @Autowired
    LianxiTestAMapper lianxiTestAMapper;
    @Override
    public void add(LianxiTestACustom lianxiTestACustom) throws Exception {
        lianxiTestAMapper.insert(lianxiTestACustom);
    }
}
