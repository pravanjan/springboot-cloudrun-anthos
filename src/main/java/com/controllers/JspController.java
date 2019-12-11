package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspController {
    @RequestMapping("/index")
    public String index( ){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello( ){
        return "hello";
    }
}
