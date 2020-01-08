package com.system.controller;

import com.system.po.StudentCustom;
import com.system.po.TeacherCustom;
import com.system.service.StudentService;
import com.system.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class regController {

    @Resource(name = "teacherServiceImpl")
    private TeacherService teacherService;

    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/reg")
    public String reg(Model model, HttpServletRequest request) throws Exception {
        String role = request.getParameter("role");
        if (role.equals("老师")) {
            TeacherCustom teacherCustom = new TeacherCustom();
            String id = request.getParameter("studentId");
            String name = request.getParameter("studentName");
            String zhuanye = request.getParameter("zhuanye");
            String pwd = request.getParameter("studentPwd");
            teacherCustom.setTeacherId(Integer.parseInt(id));
            teacherCustom.setTeacherName(name);
            teacherCustom.setRole(role);
            teacherCustom.setTeachCourse(zhuanye);
            teacherCustom.setTeacherPwd(pwd);
            teacherService.add(teacherCustom);
            return "login.jsp";
        } else if (role.equals("学生")) {
            StudentCustom studentCustom = new StudentCustom();
            String id = request.getParameter("studentId");
            String name = request.getParameter("studentName");
            String zhuanye = request.getParameter("zhuanye");
            String pwd = request.getParameter("studentPwd");
            studentCustom.setStudentId(Integer.parseInt(id));
            studentCustom.setStudentName(name);
            studentCustom.setStudentRole(role);
            studentCustom.setZhuanye(zhuanye);
            studentCustom.setStudentPwd(pwd);
            studentService.add(studentCustom);
            return "login.jsp";
        } else {
            return "login.jsp";
        }
    }
}
