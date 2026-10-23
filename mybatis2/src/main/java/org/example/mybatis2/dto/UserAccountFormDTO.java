package org.example.mybatis2.dto;

import org.example.mybatis2.entity.UserAccount;

public record UserAccountFormDTO(
        String name, String email, int age, String city
) {
    public UserAccount toEntity() {
        return UserAccount.builder()
                .name(name)
                .email(email)
                .age(age)
                .city(city)
                .build();
    }
}