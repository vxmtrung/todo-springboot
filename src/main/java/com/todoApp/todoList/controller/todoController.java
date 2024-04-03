package com.todoApp.todoList.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {

    @GetMapping(value = "/")
    public String helloTodo(){
        return "<h1>Hello Spring Boot, I will develop you later</h1>";
    }
}
