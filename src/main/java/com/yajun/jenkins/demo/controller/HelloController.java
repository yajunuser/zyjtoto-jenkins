package com.yajun.jenkins.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public Object hello() {
        return "hello jenkins";
    }

    @RequestMapping("/log")
    public Object log() {
        return "hello scm";
    }
}
