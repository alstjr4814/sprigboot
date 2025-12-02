package com.korit.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Map;

// 1
@RestController
public class UserController {

    private String username = "test12";
    private String password = "1234";

    @GetMapping("/info")
    public ResponseEntity<String> printInfo() {
        return ResponseEntity.ok("UserController!!!");
    }


    @GetMapping("/users")
    public ResponseEntity<Map<String, String>> getUsers(HttpServletResponse response) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("username", username, "password", password));
    }



}

//클라리언트에게 즉 users라고 타이핑했을때 응답이 오게 만들어라..