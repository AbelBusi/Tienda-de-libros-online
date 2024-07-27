package com.example.TiendaLibrosOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/homeConfigurer")
	public String home() {
		return "administrador/homeAdmin";
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