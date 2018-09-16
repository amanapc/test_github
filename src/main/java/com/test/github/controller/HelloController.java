package com.test.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello.do")
    public String hello() {

        System.out.println("say hello");
        return "hello hello";


    }
}
