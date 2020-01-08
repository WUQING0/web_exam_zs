package com.system.controller;

import com.system.po.*;
import com.system.service.ExamDatiService;
import com.system.service.ExamXuanzeService;
import com.system.service.Exam_test_a;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

//-------------------------------------------正式考试组卷

@Controller
public class examTestaController {
    @Resource(name = "examXuanzeServiceImpl")
    private ExamXuanzeService examXuanzeService;

    @Resource(name = "examDatiServiceImpl")
    private ExamDatiService examDatiService;

    @Resource(name = "exam_test_aImpl")
    private Exam_test_a lianxi_test_a;

    @RequestMapping("/showExamtest")
    public String showLianxi(Model model, HttpServletRequest request) throws Exception {
        String name = request.getParameter("type");
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        List<ExamXuanzeCustom> list = examXuanzeService.findByName(name);
        List<ExamDatiCustom> lists = examDatiService.findByName(name);
        try {


            //以下是题的数量并进行随即组卷
            if (list != null) {
                for (int i = 0; i <= 3; i++) {                                              //设置选择题的数量
                    list1.add(list.get(i));
                    Collections.shuffle(list1);
                    model.addAttribute("list", list1);
                }
            }
            if (lists != null) {
                for (int j = 0; j <= 3; j++) {                                           //设置大题的数量
                    list2.add(list.get(j));
                    Collections.shuffle(list2);
                    model.addAttribute("lists", list2);
                }
            }
            return "student/exam_exam_a.jsp";
        } catch (Exception e) {
            return "showError.jsp";
        }

    }

    //添加学生信息
    @RequestMapping("/addtestss")
    public String addtest(ExamTestACustom examTestACustom, HttpServletRequest request) throws Exception {

        HttpSession session = request.getSession(true);
        Integer id = Integer.parseInt(String.valueOf(session.getAttribute("stuid")));
        String stu = (String) session.getAttribute("stu");
        examTestACustom.setStuId(id);
        examTestACustom.setStuName(stu);
        examTestACustom.setDate(new Date());
        lianxi_test_a.add(examTestACustom);

        return "student/index.jsp";
    }
}
