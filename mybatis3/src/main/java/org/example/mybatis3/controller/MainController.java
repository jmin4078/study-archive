package org.example.mybatis3.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis3.entity.Course;
import org.example.mybatis3.entity.Student;
import org.example.mybatis3.service.EnrollService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/students")
    public String addStudent(@ModelAttribute Student student) {
        enrollService.createStudent(student);
        return "redirect:/";
    }

    @PostMapping("/courses")
    public String addCourse(@ModelAttribute Course course) {
        enrollService.createCourse(course);
        return "redirect:/";
    }
}