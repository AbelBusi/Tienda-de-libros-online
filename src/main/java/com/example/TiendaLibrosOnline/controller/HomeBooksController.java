package com.example.TiendaLibrosOnline.controller;

import com.example.TiendaLibrosOnline.model.entity.Usuario;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/home")
public class HomeBooksController {

    private final Logger logger = LoggerFactory.getLogger(HomeBooksController.class);


    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String mostrar(HttpSession session, Model model) {

        Usuario logueado = (Usuario) session.getAttribute("idUsuario");

        model.addAttribute("sesion",logueado);

        logger.info("Session: {}",session.getAttribute("idUsuario"));

        return "home/homeBook";

    }

}
