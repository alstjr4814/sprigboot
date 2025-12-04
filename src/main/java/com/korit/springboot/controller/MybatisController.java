package com.korit.springboot.controller;

import com.korit.springboot.dto.InsertProductReqDto;
import com.korit.springboot.dto.InsertStudyReqDto;
import com.korit.springboot.mapper.ProductMapper;
import com.korit.springboot.mapper.StudyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {

    @Autowired
    private StudyMapper studyMapper;
    @Autowired
    private ProductMapper productMapper;

    @PostMapping("/mybatis/study")
    public ResponseEntity<?> insert(@RequestBody InsertStudyReqDto dto) {
            studyMapper.insert(dto.getName(), dto.getAge());
        return ResponseEntity.ok().build();

    }

    @PostMapping("/mybatis/product")
    public  ResponseEntity<?> insertProduct(@RequestBody InsertProductReqDto dto) {
        productMapper.insertProduct(dto.getProductName(), dto.getSize(), dto.getPrice());
        return ResponseEntity.ok().build();

    }

}
