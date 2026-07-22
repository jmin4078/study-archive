package org.example.mybatis2.service;

import lombok.RequiredArgsConstructor;
import org.example.mybatis2.dto.UserAccountFormDTO;
import org.example.mybatis2.dto.UserSearchDTO;
import org.example.mybatis2.entity.UserAccount;
import org.example.mybatis2.mapper.UserAccountMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserAccountService {
    private final UserAccountMapper userAccountMapper;

    public void create(UserAccountFormDTO dto) {
        userAccountMapper.create(dto.toEntity());
    }

    public List<UserAccount> findAll() {
        return userAccountMapper.findAll();
    }

    public List<UserAccount> search(UserSearchDTO dto) {
        return userAccountMapper.search(dto);
    }
}