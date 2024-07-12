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

}
