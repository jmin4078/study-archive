package org.example.mybatis2.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis2.dto.UserAccountFormDTO;
import org.example.mybatis2.dto.UserAccountUpdateDTO;
import org.example.mybatis2.dto.UserSearchDTO;
import org.example.mybatis2.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public String detail(
            @PathVariable Long id,
            Model model) {
        model.addAttribute("user", userAccountService.findById(id));
        return "user-detail";
    }

    @PostMapping("/{id}")
    public String update(
            @PathVariable Long id,
            @ModelAttribute UserAccountUpdateDTO dto
    ) {
        userAccountService.update(dto);
        return "redirect:/users/%d".formatted(id);
    }

    @GetMapping("/sorted")
    public String sorted(@RequestParam String sort, Model model) {
        model.addAttribute("users", userAccountService.findAllSorted(sort));
        return "user";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam List<Long> ids) {
        userAccountService.deleteByIds(ids);
        return "redirect:/users";
    }
}