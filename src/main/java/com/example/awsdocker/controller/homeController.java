package com.example.awsdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String root() {
        return "home"; // 기본 경로로 접근할 때 home.html을 반환
    }

    @GetMapping("/home")
    public String home() {
        System.out.println("들어옴?");
        return "home";
    }
}
