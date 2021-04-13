package com.creative.webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/intro/{a}")
    public String intro(@PathVariable("a") String a) {
        return "intro/" + a;
    }

    @GetMapping("/popup/{fileName}")
    public String popup(@PathVariable("fileName") String fileName) {
        return "popup/" + fileName;
    }

    @GetMapping("/admin/login")
    public String adminLogin() {
        return "admin/login";
    }

}
