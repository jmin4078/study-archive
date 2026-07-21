package org.example.mybatis.dto;

import org.example.mybatis.entity.Board;

public record BoardFormDTO(
        String title, String content, String writer
) {
    public Board toEntity() {
        Board board = new Board();
        board.setTitle(title);
        board.setContent(content);
        board.setWriter(writer);
        return board;
    }
}
