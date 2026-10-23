package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mybatis.dto.MemberViewDTO;
import org.example.mybatis.entity.Member;

import java.util.List;

@Mapper
public interface MemberMapper {

    int insert(Member board);

    //    List<Member> findAll(); // 이름이 같으므로 자동으로 매핑
    List<MemberViewDTO> findAll(); // 이름이 같으므로 자동으로 매핑
}