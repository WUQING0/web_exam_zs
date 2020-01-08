package com.system.controller;

import com.system.po.*;
import com.system.service.Exam_test;
import com.system.service.Lianxi_test;
import com.system.service.delallService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class scoreController {

    @Resource(name = "lianxi_testImpl")
    private Lianxi_test lianxi_test;

    @Resource(name = "exam_testImpl")
    private Exam_test exam_test;

    @Resource(name = "delallServiceImpl")
    private delallService delallService;

    @RequestMapping("/showScore")
    public String showScore(Model model, HttpServletRequest request) throws Exception {
        int id = 1;
        int score = 0;
        int full = 0;
        LianxiTestCustom lianxiTestCustom = new LianxiTestCustom();
        List<LianxiTestACustom> list = lianxi_test.findByName(id);
        ArrayList<LianxiTestCustom> list1 = new ArrayList<LianxiTestCustom>();
        //循环指定的学生id的套卷
        try {
            for (int i = 0; i <= list.size() - 1; i++) {
                score = 0;
                String[] arr = list.get(i).getAnswer().split(",+");
                String[] arrs = list.get(i).getNanswer().split(",+");
                System.out.println(arr.length);
                System.out.println(arrs.length);
                //整合的分数
                for (int j = 0; j <= arr.length - 1; j++) {
                    if (arr[j].equals(arrs[j])) {
                        //分数的累加
                        score = score + 10;
                    } else {
                        full = full;
                    }
                }
                lianxiTestCustom.setStuId(list.get(i).getStuId());
                lianxiTestCustom.setStuName(list.get(i).getStuName());
                lianxiTestCustom.setStuScore(score);
                lianxi_test.add(lianxiTestCustom);


            }
            list1.add(lianxiTestCustom);
            model.addAttribute("list1", list1);


            return "student/score.jsp";
        } catch (Exception e) {
            return "showError.jsp";
        }
    }

    @RequestMapping("/showScoreq")
    public String showScores(Model model, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(true);
        Integer id = Integer.parseInt(String.valueOf(session.getAttribute("stuid")));
        List<ExamTestCustom> list = exam_test.findByName(id);
        model.addAttribute("list", list);
        return "student/scores.jsp";
    }

    @RequestMapping("/showScorey")
    public String showScoresy(Model model) throws Exception {
        List<ExamTest> list = exam_test.findByAll();
        model.addAttribute("list", list);
        return "teacher/check.jsp";
    }

    @RequestMapping("/delall")
    public String delall(Model model) throws Exception {
        delallService.delall();
        return "teacher/index.jsp";
    }

}
