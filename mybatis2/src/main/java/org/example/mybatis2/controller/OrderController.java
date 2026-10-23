package org.example.mybatis2.controller;

import lombok.RequiredArgsConstructor;
import org.example.mybatis2.entity.Member;
import org.example.mybatis2.entity.Order;
import org.example.mybatis2.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public String page(Model model) {
        model.addAttribute("members", orderService.findAllMembers());
        model.addAttribute("orders", orderService.findAllOrders());
        model.addAttribute("membersWithOrders", orderService.findAllMembersWithOrders());
        return "order";
    }

    @PostMapping("/members")
    public String insertMember(@ModelAttribute Member member) {
        orderService.insertMember(member);
        return "redirect:/orders";
    }

    @PostMapping
    public String insertOrder(@ModelAttribute Order order, @RequestParam Long memberId) {
        Member m = new Member();
        m.setId(memberId);
        order.setMember(m);
        orderService.insertOrder(order);
        return "redirect:/orders";
    }
}