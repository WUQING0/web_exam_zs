package com.system.controller;

import com.system.po.*;
import com.system.service.Lianxi_test;
import com.system.service.tchCheck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class tchCheckController {

    @Resource(name = "tchCheckImpl")
    private com.system.service.tchCheck tchCheck;


    @RequestMapping("/showScores")
    public String showScore(Model model, HttpServletRequest request) throws Exception {
        int id = 1;
        int score = 0;
        int full = 0;
        ExamTestCustom examTestCustom = new ExamTestCustom();
        List<ExamTestA> list = tchCheck.findAll();
        try {
            //循环指定的学生id的套卷
            for (int i = 0; i <= list.size() - 1; i++) {
                score = 0;
                String[] arr = list.get(i).getAnswer().split(",+");
                String[] arrs = list.get(i).getNanswer().split(",+");

                //整合的分数
                for (int j = 0; j <= arr.length - 1; j++) {
                    if (arr[j].equals(arrs[j])) {

                        //分数的累加
                        score = score + 10;
                    } else {
                        full = full;
                    }
                }

                examTestCustom.setStuId(list.get(i).getStuId());
                examTestCustom.setStuName(list.get(i).getStuName());
                examTestCustom.setStuScore(score);
                tchCheck.add(examTestCustom);
            }
            return "student/score.jsp";
        } catch (Exception e) {
            return "showError.jsp";
        }
    }


}
