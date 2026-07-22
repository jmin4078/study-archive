package org.example.mybatis2.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Order {
    private Long id;
    private String productName;
    private LocalDateTime orderDate;
    private Member member; // 주문자를 속성으로 가져감 (실제로는 fk)
}
