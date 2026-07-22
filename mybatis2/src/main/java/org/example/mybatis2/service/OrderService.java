package org.example.mybatis2.service;

import lombok.RequiredArgsConstructor;
import org.example.mybatis2.entity.Member;
import org.example.mybatis2.entity.Order;
import org.example.mybatis2.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderMapper orderMapper;

    // 4개
    // insertMember, insertOrder, findAllOrders, findAllMembers
    public void insertMember(Member member) {
        orderMapper.insertMember(member);
    }

    public void insertOrder(Order order) {
        orderMapper.insertOrder(order);
    }

    public List<Member> findAllMembers() {
        return orderMapper.findAllMembers();
    }

    public List<Order> findAllOrders() {
        return orderMapper.findAllOrders();
    }
}
