package org.example.mybatis2.entity;

// User <- Spring Security가 쓰는 인터페이스 명 중 하나

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserAccount {
    private long id; // BIGINT, PK
    private String name;
    private String email;
    private Integer age;
    private String city;
}