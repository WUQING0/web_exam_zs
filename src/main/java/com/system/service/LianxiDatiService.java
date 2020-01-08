package com.system.service;

import com.system.po.LianxiDati;
import com.system.po.LianxiDatiCustom;

import java.util.List;

public interface LianxiDatiService {
    List<LianxiDati> findByAll() throws Exception;
    List<LianxiDatiCustom> findByName(String name) throws  Exception;
    int deleteById(Integer id) throws Exception;
    void update(LianxiDatiCustom lianxiDatiCustom) throws Exception;
    void add(LianxiDatiCustom lianxiDatiCustom) throws Exception;
}
