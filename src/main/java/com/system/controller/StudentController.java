package com.system.controller;

import com.system.po.Student;
import com.system.po.StudentCustom;
import com.system.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    //查找全部学生信息
    @RequestMapping("/showStudent")
    public String showStudent(Model model) throws Exception {
        ArrayList<Student> list = (ArrayList<Student>) studentService.findAll();
        model.addAttribute("list", list);
        return "pages/morris.jsp";
    }

    //添加学生信息
    @RequestMapping("/addStudents")
    public String addStudent(StudentCustom studentCustom) throws Exception {
        studentService.add(studentCustom);
        return "showStudent";
    }

    //删除指定学生账户
    @RequestMapping("/deleteStudent")
    public String deleteStudent(Integer id) throws Exception {
        studentService.delete(id);
        return "showStudent";
    }

    //修改学生信息
    @RequestMapping("updateStudent")
    public String updateStudent(StudentCustom studentCustom) throws Exception {
        studentService.update(studentCustom);
        return "showStudent";
    }

    //根据学生姓名查找
    @RequestMapping("/findByName")
    public String findByName(String name, Model model, HttpServletRequest request) throws Exception {
        name = request.getParameter("findByName");
        List<StudentCustom> list = studentService.findByName(name);
        model.addAttribute("list", list);
        return "pages/morris.jsp";

    }


}
