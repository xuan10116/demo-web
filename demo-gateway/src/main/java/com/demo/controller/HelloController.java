package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping( "/hello" )
public class HelloController {
    @GetMapping("/spring")
    @ResponseBody
    public String helloSpring() {
        return "hello spring";
    }
    @GetMapping("/summer")
    @ResponseBody
    public String helloSummer(HttpServletResponse response) {
        return "hello spring";
    }
}
