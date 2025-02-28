package com.heroku.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nat")
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Heroku!";
    }
}