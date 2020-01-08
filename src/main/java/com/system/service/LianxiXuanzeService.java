package com.system.service;

import com.system.po.LianxiXuanze;
import com.system.po.LianxiXuanzeCustom;

import java.util.List;

public interface LianxiXuanzeService {
    List<LianxiXuanze> findByAll() throws Exception;
    List<LianxiXuanzeCustom> findByName(String name) throws  Exception;
    int deleteById(Integer id) throws Exception;
    void update(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception;
    void add(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception;
}
