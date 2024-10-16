package com.example.TiendaLibrosOnline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.TiendaLibrosOnline.model.entity.Usuario;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@GetMapping("/homeConfigurer")
	public String home(HttpSession session, Model model) {
		
		Usuario logueado = (Usuario) session.getAttribute("idUsuario");

        model.addAttribute("sesion",logueado);

        logger.info("Session: {}",session.getAttribute("idUsuario"));
		
		return "administrador/homeAdmin";
	}
	
	@GetMapping("/ingresarAdmin")
	public String ingresarAdmin() {
		
		return "acceso/loginAdmin";
		
	}

	@GetMapping("/agregarProducto")
	public String producto() {

		return "administrador/addLibro";

	}
	
	@GetMapping("/libros")
	public String totalLibros() {
		
		return "administrador/librosAll";
		
	}
	
	@GetMapping("/formEditorial")
	public String editorial() {
		
		return "administrador/addEditorial";
	}
	
	@GetMapping("/formCategoria")
	public String categoria() {
		
		return "administrador/addCategoria";
	}
	
	@GetMapping("/formAutor")
	public String autor(){
		
		return "administrador/addAutor";
		
	}
	
	@GetMapping("/logistics")
	public String logistics() {
		
		return "administrador/logisticsBook";
		
	}

}