package org.example.mybatis3.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis3.service.EnrollService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MainController {
    private final EnrollService enrollService;

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("students", enrollService.findAllStudents());
        model.addAttribute("courses", enrollService.findAllCourses());
        return "index";
    }
}