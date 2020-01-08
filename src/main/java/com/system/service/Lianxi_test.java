package com.system.service;

import com.system.po.LianxiTestACustom;
import com.system.po.LianxiTestCustom;

import java.util.List;

public interface Lianxi_test {
    List<LianxiTestACustom> findByName(int id) throws  Exception;
    void add(LianxiTestCustom lianxiTestCustom) throws Exception;
}
