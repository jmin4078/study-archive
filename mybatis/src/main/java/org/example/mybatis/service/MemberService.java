package org.example.mybatis.service;

import lombok.RequiredArgsConstructor;
import org.example.mybatis.dto.MemberFormDTO;
import org.example.mybatis.dto.MemberViewDTO;
import org.example.mybatis.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    public void create(MemberFormDTO dto) {
        memberMapper.insert(dto.toEntity());
    }

    public List<MemberViewDTO> findAll() {
        return memberMapper.findAll();
    }
}