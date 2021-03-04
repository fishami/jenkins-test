package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @RequestMapping("/")
    public String mainPage(){
        return "成功啦";
    }
}
