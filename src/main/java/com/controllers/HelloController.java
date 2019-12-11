package com.controllers;

import com.helper.HelloHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {


    @RequestMapping(path = "/test")
    public String helloGradle(){
        return HelloHelper.sayhello();
    }

}
