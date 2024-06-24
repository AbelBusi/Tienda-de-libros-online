package com.example.TiendaLibrosOnline.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.TiendaLibrosOnline.model.Usuario;



@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @GetMapping("/ingresar")
    public String iniciarSesion(){

        return "acceso/login";

    }

    @GetMapping("/crearCuenta")
    public String registrarUsuario(Model model){
    	
    	Usuario usuario= new Usuario();
    	
    	model.addAttribute("usuarioForm",usuario );
    	
        return "acceso/registerUser";
    }
    
    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario,Model model ) {
    	
    	model.addAttribute("usuarioForm", new Usuario());
    	logger.info("Usuario {}",usuario);
    	return "redirect:/home";
    }




}
