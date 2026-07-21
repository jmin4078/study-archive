package org.example.mybatis.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.dto.MemberFormDTO;
import org.example.mybatis.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mem")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public String page(Model model) {
        // model...
        model.addAttribute("members", memberService.findAll());
        return "member";
    }

    @PostMapping
    public String save(MemberFormDTO dto) {
        memberService.create(dto);
        return "redirect:/mem";
    }
}