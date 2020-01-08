package com.system.controller;

import com.system.po.*;
import com.system.service.LianxiDatiService;
import com.system.service.LianxiXuanzeService;
import com.system.service.Lianxi_test_a;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

//-------------------------------------------练习考试组卷
@Controller
public class LianxiTestaController {
    @Resource(name = "lianxiXuanzeServiceImpl")
    private LianxiXuanzeService lianxiXuanzeService;

    @Resource(name = "lianxiDatiServiceImpl")
    private LianxiDatiService lianxiDatiService;

    @Resource(name = "lianxi_test_aImpl")
    private Lianxi_test_a lianxi_test_a;

    @RequestMapping("/showLianxitest")
    public String showLianxi(Model model, HttpServletRequest request) throws Exception {
        String type = request.getParameter("type");

        //以下是题的数量并进行随即组卷
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        List<LianxiXuanzeCustom> list = lianxiXuanzeService.findByName(type);
        List<LianxiDatiCustom> lists = lianxiDatiService.findByName(type);
        try {
            for (int i = 0; i <= 3; i++) {                                      //设置选择题的数量
                list1.add(list.get(i));
                Collections.shuffle(list1);
                model.addAttribute("list1", list1);
            }
            for (int j = 0; j <= 3; j++) {                                              //设置大题的数量
                list2.add(lists.get(j));
                Collections.shuffle(list2);
                model.addAttribute("list2", list2);
            }
            return "student/lianxi_exam_a.jsp";
        } catch (Exception e) {
            return "student/index.jsp";
        }
    }

    //添加学生信息
    @RequestMapping("/addtest")
    public String addtest(LianxiTestACustom lianxiTestACustom, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(true);
        Integer id = Integer.parseInt(String.valueOf(session.getAttribute("stuid")));
        String stu = (String) session.getAttribute("stu");
        lianxiTestACustom.setStuId(id);
        lianxiTestACustom.setStuName(stu);

        lianxiTestACustom.setDate(new Date());
        lianxi_test_a.add(lianxiTestACustom);

        return "student/index.jsp";
    }
}
