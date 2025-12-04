package com.korit.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    int insertProduct(@Param("product_name") String name ,@Param("product_size") String size, @Param("product_price") int price );

}