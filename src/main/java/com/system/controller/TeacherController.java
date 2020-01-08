package com.system.controller;

import com.system.po.Teacher;
import com.system.po.TeacherCustom;
import com.system.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TeacherController {
    @Resource(name = "teacherServiceImpl")
    private TeacherService teacherService;

    //查找全部学生信息
    @RequestMapping("/showTeacher")
    public String showTeacher(Model model) throws Exception {
        ArrayList<Teacher> list = (ArrayList<Teacher>) teacherService.findByAll();
        model.addAttribute("list", list);
        return "pages/flot.jsp";
    }

    //添加学生信息
    @RequestMapping("/addTeachers")
    public String addTeacher(TeacherCustom teacherCustom) throws Exception {
        teacherService.add(teacherCustom);
        return "showTeacher";
    }

    //删除指定学生账户
    @RequestMapping("/deleteTeacher")
    public String deleteTeacher(Integer id) throws Exception {
        teacherService.deleteById(id);
        return "showTeacher";
    }

    //修改学生信息
    @RequestMapping("updateTeacher")
    public String updateTeacher(TeacherCustom teacherCustom) throws Exception {
        teacherService.update(teacherCustom);
        return "showTeacher";
    }

    //根据学生姓名查找
    @RequestMapping("/findByNames")
    public String findByName(String name, Model model, HttpServletRequest request) throws Exception {
        name = request.getParameter("findByName");
        List<TeacherCustom> list = teacherService.findByName(name);
        model.addAttribute("list", list);
        return "pages/flot.jsp";

    }
}
