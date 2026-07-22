package org.example.mybatis2.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Member {
    private Long id;
    private String name;
    private String email;
}