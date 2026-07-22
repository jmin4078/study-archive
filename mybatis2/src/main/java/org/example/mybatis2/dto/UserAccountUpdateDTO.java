package org.example.mybatis2.dto;

import org.example.mybatis2.entity.UserAccount;

public record UserAccountUpdateDTO(
        long id, String name, String email, Integer age, String city
) {
    public UserAccount toEntity() {
        return UserAccount.builder()
                .id(id)
                .name(name)
                .email(email)
                .age(age)
                .city(city)
                .build();
    }
}