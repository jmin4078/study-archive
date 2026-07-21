package org.example.mybatis.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.dto.BoardFormDTO;
import org.example.mybatis.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public String detail(Model model, @PathVariable("id") long id) {
        model.addAttribute("board", boardService.findById(id));
        return "detail";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable long id, @ModelAttribute BoardFormDTO dto) {
        boardService.update(id, dto);
        return "redirect:/board/%s".formatted(id); // 수정 후 상세 페이지로 다시
    }

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        boardService.delete(id);
        return "redirect:/"; // 삭제 되었으니 전체 목록
    }
}
