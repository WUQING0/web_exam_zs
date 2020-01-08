package com.system.controller;

import com.system.po.LianxiDati;
import com.system.po.LianxiXuanze;
import com.system.po.LianxiXuanzeCustom;
import com.system.service.LianxiDatiService;
import com.system.service.LianxiXuanzeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class lianxiController {

    @Resource(name = "lianxiXuanzeServiceImpl")
    private LianxiXuanzeService lianxiXuanzeService;

    @Resource(name = "lianxiDatiServiceImpl")
    private LianxiDatiService lianxiDatiService;

    //查找全部试题信息
    @RequestMapping("/showLianxi")
    public String showLianxi(Model model) throws Exception {
        ArrayList<LianxiXuanze> list = (ArrayList<LianxiXuanze>) lianxiXuanzeService.findByAll();
        ArrayList<LianxiDati> lists = (ArrayList<LianxiDati>) lianxiDatiService.findByAll();
        model.addAttribute("list", list);
        model.addAttribute("lists", lists);
        return "pages/lianxi_exam.jsp";
    }

    //查找全部试题信息
    @RequestMapping("/showLianxir")
    public String showLianxir(Model model) throws Exception {
        ArrayList<LianxiXuanze> list = (ArrayList<LianxiXuanze>) lianxiXuanzeService.findByAll();
        ArrayList<LianxiDati> lists = (ArrayList<LianxiDati>) lianxiDatiService.findByAll();
        model.addAttribute("list", list);
        model.addAttribute("lists", lists);
        return "teacher/lianxi_exam.jsp";
    }

    //添加试题信息
    @RequestMapping("/addLianxi")
    public String addLianxi(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception {
        lianxiXuanzeService.add(lianxiXuanzeCustom);
        return "showLianxi";
    }

    //添加试题信息
    @RequestMapping("/addLianxir")
    public String addLianxir(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception {
        lianxiXuanzeService.add(lianxiXuanzeCustom);
        return "showLianxir";
    }

    //删除指定学生账户
    @RequestMapping("/deleteLianxi")
    public String deleteLianxi(Integer id) throws Exception {
        lianxiXuanzeService.deleteById(id);
        return "showLianxi";
    }

    //删除指定学生账户
    @RequestMapping("/deleteLianxir")
    public String deleteLianxir(Integer id) throws Exception {
        lianxiXuanzeService.deleteById(id);
        return "showLianxir";
    }

    //修改学生信息
    @RequestMapping("updateLianxi")
    public String updateLianxi(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception {
        lianxiXuanzeService.update(lianxiXuanzeCustom);
        return "showLianxi";
    }

    //修改学生信息
    @RequestMapping("updateLianxir")
    public String updateLianxir(LianxiXuanzeCustom lianxiXuanzeCustom) throws Exception {
        lianxiXuanzeService.update(lianxiXuanzeCustom);
        return "showLianxir";
    }

    //根据学生姓名查找
    @RequestMapping("/findByNamez")
    public String findByName(String name, Model model, HttpServletRequest request) throws Exception {
        name = request.getParameter("findByNamez");
        List<LianxiXuanzeCustom> list = lianxiXuanzeService.findByName(name);
        model.addAttribute("list", list);
        return "pages/lianxi_exam.jsp";

    }


}
