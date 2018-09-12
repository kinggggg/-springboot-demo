package com.zeek.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/tests")
public class TestController {

    @GetMapping
    @ResponseBody
    public Object hello() {

        return "hello world" ;
    }
}
