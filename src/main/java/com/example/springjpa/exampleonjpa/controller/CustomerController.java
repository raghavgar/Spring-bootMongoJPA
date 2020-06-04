package com.example.springjpa.exampleonjpa.controller;

import com.example.springjpa.exampleonjpa.service.SqlNoSqlPersistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    SqlNoSqlPersistService service;

    @GetMapping("/hello")
    public void someMethod(){
        service.getCustomers();

    }


}
