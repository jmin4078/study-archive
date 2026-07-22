package org.example.mybatis2.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis2.dto.UserAccountFormDTO;
import org.example.mybatis2.dto.UserSearchDTO;
import org.example.mybatis2.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserAccountController {
    private final UserAccountService userAccountService;

    @GetMapping
    public String page(Model model) {
        model.addAttribute("users", userAccountService.findAll());
        return "user";
    }

    @PostMapping
    public String create(@ModelAttribute UserAccountFormDTO dto) {
        userAccountService.create(dto);
        return "redirect:/users";
    }

    @GetMapping("/search")
    public String search(@ModelAttribute UserSearchDTO dto, Model model) {
        model.addAttribute("users", userAccountService.search(dto));
        return "user";
    }
}