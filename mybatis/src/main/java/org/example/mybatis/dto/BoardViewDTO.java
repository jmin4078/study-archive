package org.example.mybatis.dto;

import lombok.Builder;
import lombok.Getter;
import org.example.mybatis.entity.Board;

@Getter
@Builder
public class BoardViewDTO {
    private final long id;
    private final String title;
    private final String content;
    private final String writer;
    private final String createdAt;

    public static BoardViewDTO fromEntity(Board board) {
        return BoardViewDTO.builder()
                .id(board.getId())
                .title(board.getTitle())
                .content(board.getContent())
                .writer(board.getWriter())
                .createdAt(board.getCreatedAt().toString())
                .build();
    }
}