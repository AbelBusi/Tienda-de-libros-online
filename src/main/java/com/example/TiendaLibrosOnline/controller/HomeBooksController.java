package com.example.TiendaLibrosOnline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/home")
public class HomeBooksController {

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String mostrar(){

        return "home/homeBook";

    }
    
    
    
    

}
