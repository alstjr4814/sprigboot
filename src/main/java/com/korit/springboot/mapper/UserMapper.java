package com.korit.springboot.mapper;

import com.korit.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int insert(UserEntity userEntity); //user.xml 안의 <insert id="insert"> 실행시키는 sql
    UserEntity findUserByUsername(@Param("username") String username);
    UserEntity findUserByUserId(@Param("userId") int userId);

}
