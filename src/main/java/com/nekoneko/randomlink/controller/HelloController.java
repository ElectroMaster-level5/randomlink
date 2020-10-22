package com.nekoneko.randomlink.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping
    public String index(){
        return "Your first spring boot application";
    }
}
