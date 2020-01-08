package com.system.controller;

import com.system.po.ExamDatiCustom;
import com.system.service.ExamDatiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class examDatiController {
    @Resource(name = "examDatiServiceImpl" )
    private ExamDatiService examDatiService;

    //添加试题信息
    @RequestMapping("/addExamDati")
    public String addDati(ExamDatiCustom examDatiCustom) throws Exception{
        examDatiService.add(examDatiCustom);
        return "showExam";
    }
    //添加试题信息
    @RequestMapping("/addExamDatir")
    public String addDatir(ExamDatiCustom examDatiCustom) throws Exception{
        examDatiService.add(examDatiCustom);
        return "showExamr";
    }

    //删除指定学生账户
    @RequestMapping("/deleteExamDati")
    public String deleteExamDati(Integer id) throws Exception{
        examDatiService.deleteById(id);
        return "showExam";
    }
    //删除指定学生账户
    @RequestMapping("/deleteExamDatir")
    public String deleteExamDatir(Integer id) throws Exception{
        examDatiService.deleteById(id);
        return "showExamr";
    }
    //修改学生信息
    @RequestMapping("updateExamDati")
    public String updateExamDati(ExamDatiCustom examDatiCustom) throws Exception{
        examDatiService.update(examDatiCustom);
        return "showExam";
    }
    //修改学生信息
    @RequestMapping("updateExamDatir")
    public String updateExamDatir(ExamDatiCustom examDatiCustom) throws Exception{
        examDatiService.update(examDatiCustom);
        return "showExamr";
    }

}
