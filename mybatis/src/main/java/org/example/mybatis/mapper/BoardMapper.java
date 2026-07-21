package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.example.mybatis.entity.Board;


@Mapper
public interface BoardMapper {

    @Insert("""
INSERT INTO BOARDS(title,content,writer)
VALUES
    (#{title},#{content},#{writer})
""")
    @Options(
            useGeneratedKeys = true,
            keyProperty = "id"
    )

    int insert(Board board);
}
