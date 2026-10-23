package org.example.mybatis2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mybatis2.dto.UserSearchDTO;
import org.example.mybatis2.entity.UserAccount;

import java.util.List;

@Mapper
public interface UserAccountMapper {

    void create(UserAccount userAccount); // USERS

    List<UserAccount> findAll();

    List<UserAccount> search(UserSearchDTO dto);

    UserAccount findById(Long id);

    void update(UserAccount userAccount);

    List<UserAccount> findAllSorted(String sort);

    void deleteByIds(List<Long> ids);
}