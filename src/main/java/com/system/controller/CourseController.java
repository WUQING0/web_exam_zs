package com.system.controller;

import com.system.po.Course;
import com.system.po.CourseCustom;
import com.system.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CourseController {
    @Resource(name = "courseServiceImpl")
    private CourseService courseService;

    //查找全部学生信息
    @RequestMapping("/showCourse")
    public String showCourse(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<Course> list = (ArrayList<Course>) courseService.findByAll();
        model.addAttribute("list", list);
        return "pages/morriss.jsp";
    }

    //查找全部学生信息
    @RequestMapping("/showCourser")
    public String showCourser(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<Course> list = (ArrayList<Course>) courseService.findByAll();
        model.addAttribute("list", list);
        return "teacher/morriss.jsp";
    }

    //查找全部学生信息,转发到开始练习界面
    @RequestMapping("/showCourses")
    public String showCourses(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<Course> list = (ArrayList<Course>) courseService.findByAll();
        model.addAttribute("list", list);
        return "student/lianxi_exam.jsp";
    }

    //查找符合要求的课程类别信息,转发到开始考试界面
    @RequestMapping("/showCoursess")
    public String showCoursess(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<Course> list = (ArrayList<Course>) courseService.findByAll();
        model.addAttribute("list", list);
        return "student/exam_exam.jsp";
    }

    //添加学生信息
    @RequestMapping("/addCourses")
    public String addCourse(CourseCustom courseCustom) throws Exception {
        courseService.add(courseCustom);
        return "showCourse";
    }

    //添加学生信息
    @RequestMapping("/addCoursesr")
    public String addCourser(CourseCustom courseCustom) throws Exception {
        courseService.add(courseCustom);
        return "showCourser";
    }

    //删除指定学生账户
    @RequestMapping("/deleteCourse")
    public String deleteCourse(Integer id) throws Exception {
        courseService.deleteById(id);
        return "showCourse";
    }

    //删除指定学生账户
    @RequestMapping("/deleteCourser")
    public String deleteCourser(Integer id) throws Exception {
        courseService.deleteById(id);
        return "showCourser";
    }

    //修改学生信息
    @RequestMapping("updateCourse")
    public String updateCourse(CourseCustom courseCustom) throws Exception {
        courseService.update(courseCustom);
        return "showCourse";
    }

    @RequestMapping("updateCourser")
    public String updateCourser(CourseCustom courseCustom) throws Exception {
        courseService.update(courseCustom);
        return "showCourser";
    }

    //根据学生姓名查找
    @RequestMapping("/findByNamess")
    public String findByName(String name, Model model, HttpServletRequest request) throws Exception {
        name = request.getParameter("findByNamess");
        List<CourseCustom> list = courseService.findByName(name);
        model.addAttribute("list", list);
        return "pages/morriss.jsp";

    }

    //根据学生姓名查找
    @RequestMapping("/findByNamessr")
    public String findByNamer(String name, Model model, HttpServletRequest request) throws Exception {
        name = request.getParameter("findByNamess");
        List<CourseCustom> list = courseService.findByName(name);
        model.addAttribute("list", list);
        return "teacher/morriss.jsp";

    }

}
