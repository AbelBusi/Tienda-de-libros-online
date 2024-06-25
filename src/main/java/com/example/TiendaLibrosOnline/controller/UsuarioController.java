package com.example.TiendaLibrosOnline.controller;

import org.slf4j.LoggerFactory;

import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.TiendaLibrosOnline.model.Usuario;
import com.example.TiendaLibrosOnline.serviceImpl.UsuarioServiceImpl;



@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioServiceImpl usuarioService;

    @GetMapping("/ingresar")
    @ResponseStatus(HttpStatus.OK)
    public String iniciarSesion(){

        return "acceso/login";

    }

    @GetMapping("/crearCuenta")
    public String registrarUsuario(Model model){
    	
    	Usuario usuario= new Usuario();
    	
    	model.addAttribute("usuarioForm",usuario);
    	
        return "acceso/registerUser";
    }
    
    
    @PostMapping("/guardarUsuario")
    @ResponseStatus(HttpStatus.CREATED)
    public String guardarUsuario(@ModelAttribute Usuario usuario,Model model ) {
    	
    	model.addAttribute("usuarioForm", usuario);
    	
    	Optional<Usuario> UsuarioEmail= usuarioService.verificarUsuario(usuario.getEmail());
    	
    	if(UsuarioEmail.isPresent()) {
    		return "redirect:/";
    	}
    	
    	
    	
    	usuarioService.crearUsuario(usuario);
    	
    	logger.info("Usuario {}",usuario);
    	
    	return "home/homeBook";
    }




}
