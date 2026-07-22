package org.example.mybatis2.dto;

import lombok.*;
import org.example.mybatis2.entity.Order;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MemberWithOrdersDTO {
    private Long id;
    private String name;
    private String email;
    private List<Order> orders = new ArrayList<>();
}