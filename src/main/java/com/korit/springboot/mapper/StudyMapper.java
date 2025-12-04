package com.korit.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudyMapper {
    int insert(@Param("name") String name,@Param("name") int age);
    List<String> findAllName();
}
