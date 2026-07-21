package org.example.mybatis.service;


import lombok.RequiredArgsConstructor;
import org.example.mybatis.dto.BoardFormDTO;
import org.example.mybatis.dto.BoardViewDTO;
import org.example.mybatis.entity.Board;
import org.example.mybatis.mapper.BoardMapper;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void create(BoardFormDTO dto) {
        boardMapper.insert(dto.toEntity());
    }

    public List<BoardViewDTO> findAll() {
        return boardMapper.findAll()
                .stream()
                .map(BoardViewDTO::fromEntity)
                .toList();
    }

    public BoardViewDTO findById(long id) {
        return BoardViewDTO.fromEntity(boardMapper.findById(id));
    }
    public void update(long id, BoardFormDTO dto) {
        Board board = boardMapper.findById(id);
        board.setTitle(dto.title());
        board.setContent(dto.content());
        board.setWriter(dto.writer());
        boardMapper.update(board);
    }

    public void delete(long id) {
        boardMapper.delete(id);
    }
}
