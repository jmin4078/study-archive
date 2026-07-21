package org.example.mybatis.dto;

import org.example.mybatis.entity.Member;

public record MemberFormDTO(
        String name, String email
) {
    public Member toEntity() {
        Member member = new Member();
        member.setName(name);
        member.setEmail(email);
        return member;
    }
}