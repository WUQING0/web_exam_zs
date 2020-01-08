package com.system.controller;

import com.system.po.LianxiDatiCustom;
import com.system.service.LianxiDatiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class lianxiDatiController {
    @Resource(name = "lianxiDatiServiceImpl")
    private LianxiDatiService lianxiDatiService;

    //添加试题信息
    @RequestMapping("/addDati")
    public String addDati(LianxiDatiCustom lianxiDatiCustom) throws Exception {
        lianxiDatiService.add(lianxiDatiCustom);
        return "showLianxi";
    }

    //删除指定学生账户
    @RequestMapping("/deleteDati")
    public String deleteDati(Integer id) throws Exception {
        lianxiDatiService.deleteById(id);
        return "showLianxi";
    }

    //删除指定学生账户
    @RequestMapping("/deleteDatir")
    public String deleteDatir(Integer id) throws Exception {
        lianxiDatiService.deleteById(id);
        return "showLianxir";
    }

    //修改学生信息
    @RequestMapping("updateDati")
    public String updateDati(LianxiDatiCustom lianxiDatiCustom) throws Exception {
        lianxiDatiService.update(lianxiDatiCustom);
        return "showLianxi";
    }

    //修改学生信息
    @RequestMapping("updateDatir")
    public String updateDatir(LianxiDatiCustom lianxiDatiCustom) throws Exception {
        lianxiDatiService.update(lianxiDatiCustom);
        return "showLianxir";
    }

    //根据学生姓名查找
    @RequestMapping("/findByNamezz")
    public String findByName(String name, Model model, HttpServletRequest request) throws Exception {
        name = request.getParameter("findByNamezz");
        List<LianxiDatiCustom> list = lianxiDatiService.findByName(name);
        model.addAttribute("list", list);
        return "pages/lianxi_exam.jsp";

    }
}
