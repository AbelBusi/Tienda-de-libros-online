package com.example.TiendaLibrosOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/ingresar")
    public String iniciarSesion(){

        return "acceso/login";

    }

    @GetMapping("/crearCuenta")
    public String registrarUsuario(){
        return "acceso/registerUser";
    }




}
