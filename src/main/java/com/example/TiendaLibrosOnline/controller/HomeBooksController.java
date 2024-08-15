package com.example.TiendaLibrosOnline.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/home")
public class HomeBooksController {

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String mostrar(HttpSession session, Model model){

        model.addAttribute("session",session.getAttribute("idUsuario"));

        return "home/homeBook";

    }
    
    
    
    

}
