package org.example.mybatis2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 검색 조건 -> name, city, minAge 있을 수도 없을 수도...
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSearchDTO {
    private String name;
    private String city;
    private Integer minAge;
}