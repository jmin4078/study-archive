package org.example.mybatis.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {
    private final BoardService boardService;

    @GetMapping("/")
//    public String index() {
    public String index(Model model) {
        model.addAttribute("boards", boardService.findAll());
        return "index";
    }
}