package com.springsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {


    @GetMapping("/publicApi")
    public String publicApi()
    {

        return " This is public Api";
    }


    @GetMapping("/adminApi")
    public String adminApi()
    {

        return " This is admin Api";
    }
}
