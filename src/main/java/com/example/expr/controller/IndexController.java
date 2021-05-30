package com.example.expr.controller;

import com.example.expr.query.GradeQuery;
import com.example.expr.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private StudentScoreService studentScoreService;

    @GetMapping({"/","/index"})
    public String index(Model model) {
        List<GradeQuery> gradeQueryList = studentScoreService.getAllInfo();
        model.addAttribute("grade", gradeQueryList);
        return "/index";
    }

    @PostMapping("/api/getGrade")
    public String getGrade(@RequestParam String name, RedirectAttributes attributes) {
        List<GradeQuery> gradeQueryList = studentScoreService.getStudentInfo(name);
        if (gradeQueryList.isEmpty()){
            attributes.addFlashAttribute("message", "查找失败");
            return "redirect:/index";
        }
        else {
            attributes.addFlashAttribute("message", "查找成功");
            attributes.addFlashAttribute("grade", gradeQueryList);
            return "redirect:/studentGrade";
        }
    }

    @GetMapping("/studentGrade")
    public String studentGrade(@ModelAttribute("grade") List<GradeQuery> gradeQueryList){
        return "/index";
    }
}
