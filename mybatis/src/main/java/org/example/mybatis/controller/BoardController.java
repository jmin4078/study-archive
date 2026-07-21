package org.example.mybatis.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.dto.BoardFormDTO;
import org.example.mybatis.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public String create(@ModelAttribute BoardFormDTO dto) {
        boardService.create(dto);
        return "redirect:/";
    }
}