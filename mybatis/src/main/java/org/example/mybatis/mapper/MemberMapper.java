package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mybatis.entity.Member;

import java.util.List;

@Mapper
public interface MemberMapper {

    int insert(Member board);

    List<Member> findAll();
}