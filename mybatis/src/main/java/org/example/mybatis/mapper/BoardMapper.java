package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.example.mybatis.entity.Board;

import java.util.List;


@Mapper
public interface BoardMapper {

    //    @Insert("""
//INSERT INTO BOARDS
//    (title, content, writer)
//VALUES
//    (#{title}, #{content}, #{writer})
//""")
//    @Options(
//            useGeneratedKeys = true, // auto increment
//            keyProperty = "id"
//    )
    int insert(Board board);

    //    @Select("SELECT id, title, content, writer, created_at FROM BOARDS")
    List<Board> findAll();

    //    @Select("SELECT id, title, content, writer, created_at FROM BOARDS WHERE id = #{id}")
    Board findById(long id);

    //    @Delete("DELETE FROM BOARDS WHERE id = #{id}")
    int delete(long id);

    //    @Update(
//            """
//UPDATE BOARDS
//    SET title = #{title}, content = #{content}, writer = #{writer}
//    WHERE id = #{id}
//"""
//    )
    int update(Board board);
}