package org.example.mybatis.service;


import lombok.RequiredArgsConstructor;
import org.example.mybatis.dto.BoardFormDTO;
import org.example.mybatis.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void create(BoardFormDTO dto){
        boardMapper.insert(dto.toEntity());
    }
}
