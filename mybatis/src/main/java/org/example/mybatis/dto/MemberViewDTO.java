package org.example.mybatis.dto;

public record MemberViewDTO(
        long id,
        String name,
        String email
) {
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}