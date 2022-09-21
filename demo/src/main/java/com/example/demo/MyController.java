package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/* 이클립스 Ctrl+Shif+o 하면 필요한 import 자동 생성됨*/
@Controller
public class MyController {

    @GetMapping("/ex01")
    public String ex01() {
        return "ex01";
    }

    @PostMapping("/ex01/answer")
    public String ex01Answer() {
        return "ex01Answer";
    }
} // class