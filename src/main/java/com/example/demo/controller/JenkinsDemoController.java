package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jenkins")
public class JenkinsDemoController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String jenkinsTest(){

        return "Hello,Jenkins-demo";
    }
}
