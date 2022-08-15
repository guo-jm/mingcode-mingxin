package com.mingcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GuoJiaming
 * @version 1.0
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello mingxin~";
    }
}
