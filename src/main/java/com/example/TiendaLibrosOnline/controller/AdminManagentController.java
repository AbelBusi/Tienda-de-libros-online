package com.example.TiendaLibrosOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/managent")
public class AdminManagentController {
	
	@GetMapping("/categories")
	public String allCategory () {
		
		return "administrador/CategoryBookAll";
	}
	
	@GetMapping("/editorials")
	public String allEditorials () {
		
		return "administrador/EditorialsBookAll";
	}
	
	@GetMapping("/rankingBooks")
	public String allRankingBook () {
		
		return "administrador/RankingBookAll";
	}
	
	@GetMapping("/actors")
	public String allActors () {
		
		return "administrador/ActorsBookAll";
	}

}
