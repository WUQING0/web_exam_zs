package com.system.controller;

import com.system.po.ExamDati;
import com.system.po.ExamXuanze;
import com.system.po.ExamXuanzeCustom;
import com.system.service.ExamDatiService;
import com.system.service.ExamXuanzeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class examController {

    @Resource(name = "examXuanzeServiceImpl")
    private ExamXuanzeService examXuanzeService;

    @Resource(name = "examDatiServiceImpl")
    private ExamDatiService examDatiService;

    //查找全部试题信息
    @RequestMapping("/showExam")
    public String showExam(Model model) throws Exception {
        ArrayList<ExamXuanze> list = (ArrayList<ExamXuanze>) examXuanzeService.findByAll();
        ArrayList<ExamDati> lists = (ArrayList<ExamDati>) examDatiService.findByAll();
        model.addAttribute("list", list);
        model.addAttribute("lists", lists);
        return "pages/exam_exam.jsp";
    }

    //查找全部试题信息
    @RequestMapping("/showExamr")
    public String showExamr(Model model) throws Exception {
        ArrayList<ExamXuanze> list = (ArrayList<ExamXuanze>) examXuanzeService.findByAll();
        ArrayList<ExamDati> lists = (ArrayList<ExamDati>) examDatiService.findByAll();
        model.addAttribute("list", list);
        model.addAttribute("lists", lists);
        return "teacher/exam_exam.jsp";
    }

    //添加试题信息
    @RequestMapping("/addExam")
    public String addExam(ExamXuanzeCustom examXuanzeCustom) throws Exception {

        examXuanzeService.add(examXuanzeCustom);
        return "showExam";
    }

    //添加试题信息
    @RequestMapping("/addExamr")
    public String addExamr(ExamXuanzeCustom examXuanzeCustom) throws Exception {

        examXuanzeService.add(examXuanzeCustom);
        return "showExam";
    }

    //删除指定学生账户
    @RequestMapping("/deleteExam")
    public String deleteExam(Integer id) throws Exception {
        examXuanzeService.deleteById(id);
        return "showExam";
    }

    //删除指定学生账户
    @RequestMapping("/deleteExamr")
    public String deleteExamr(Integer id) throws Exception {
        examXuanzeService.deleteById(id);
        return "showExamr";
    }

    //修改学生信息
    @RequestMapping("updateExam")
    public String updateExam(ExamXuanzeCustom examXuanzeCustom) throws Exception {
        examXuanzeService.update(examXuanzeCustom);
        return "showExam";
    }

    //修改学生信息
    @RequestMapping("updateExamr")
    public String updateExamr(ExamXuanzeCustom examXuanzeCustom) throws Exception {
        examXuanzeService.update(examXuanzeCustom);
        return "showExamr";
    }
//    //根据学生姓名查找
//    @RequestMapping("/findByNamez")
//    public String findByName(String name, Model model, HttpServletRequest request) throws Exception{
//        name=request.getParameter("findByNamez");
//        List<ExamXuanzeCustom> list=examXuanzeService.findByName(name);
//        model.addAttribute("list",list);
//        return "pages/exam_exam.jsp";
//
//    }
}
