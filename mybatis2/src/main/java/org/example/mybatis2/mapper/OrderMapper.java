package org.example.mybatis2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mybatis2.entity.Member;
import org.example.mybatis2.entity.Order;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> findAllOrders();

    List<Member> findAllMembers();

    void insertOrder(Order order);

    void insertMember(Member member);
}