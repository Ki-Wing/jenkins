package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "hihi";
    }
}