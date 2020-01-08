package com.system.controller;

import com.system.po.Student;
import com.system.po.StudentCustom;
import com.system.po.Teacher;
import com.system.po.TeacherCustom;
import com.system.service.StudentService;
import com.system.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    @Resource(name = "teacherServiceImpl")
    private TeacherService teacherService;

    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request) throws Exception {
        String role = request.getParameter("role");
        String id = request.getParameter("username");
        String pwd = request.getParameter("password");
        if (role.equals("管理员")) {

            try {
                if (id.equals("admin") && pwd.equals("admin")) {
                    HttpSession session = request.getSession();
                    String root = "root";
                    session.setAttribute("admin", root);
                    return "pages/index.jsp";
                } else {
                    return "login.jsp";

                }
            } catch (Exception e) {
                return "login.jsp";
            }

        } else if (role.equals("老师")) {
            try {
                List<TeacherCustom> list = teacherService.findByNamet(Integer.parseInt(id));
                if (Integer.parseInt(id) == list.get(0).getTeacherId() && pwd.equals(list.get(0).getTeacherPwd())) {
                    System.out.println(list.get(0).getTeacherId());
                    String name = list.get(0).getTeacherName();
                    int tchid = list.get(0).getTeacherId();
                    HttpSession session = request.getSession();
                    session.setAttribute("tch", name);
                    session.setAttribute("tchid", id);
                    return "teacher/index.jsp";
                } else {
                    return "login.jsp";

                }
            } catch (Exception e) {
                return "login.jsp";
            }
        } else if (role.equals("学生")) {
            try {


                List<StudentCustom> list = studentService.findByNamet(Integer.parseInt(id));
                if (Integer.parseInt(id) == list.get(0).getStudentId() && pwd.equals(list.get(0).getStudentPwd())) {
                    String name = list.get(0).getStudentName();
                    int stuid = list.get(0).getStudentId();
                    HttpSession session = request.getSession(true);
                    session.setAttribute("stu", name);
                    session.setAttribute("stuid", id);
                    return "student/index.jsp";
                } else {
                    return "login.jsp";
                }
            } catch (Exception e) {
                return "login.jsp";
            }


        }

        return "login.jsp";

    }
}
