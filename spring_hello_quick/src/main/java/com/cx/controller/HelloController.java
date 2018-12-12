package com.cx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller
 * @ResponseBody
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello success 老师!";
    }
}
