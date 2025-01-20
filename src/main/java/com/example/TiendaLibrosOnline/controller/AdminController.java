package com.example.TiendaLibrosOnline.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.TiendaLibrosOnline.model.dto.CategoriaLibroDTO;
import com.example.TiendaLibrosOnline.model.dto.EditorialDTO;
import com.example.TiendaLibrosOnline.model.entity.CategoriaLibro;
import com.example.TiendaLibrosOnline.model.entity.Editorial;
import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.serviceImpl.CategoriaLibroServiceImpl;
import com.example.TiendaLibrosOnline.serviceImpl.EditorialServiceImpl;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private CategoriaLibroServiceImpl categoriaLibroServiceImpl;
	
	@Autowired
	private EditorialServiceImpl editorialServiceImpl;

	@GetMapping("/homeConfigurer")
	public String home(HttpSession session, Model model) {

		Usuario logueado = (Usuario) session.getAttribute("idUsuario");

		model.addAttribute("sesion", logueado);

		logger.info("Session: {}", session.getAttribute("idUsuario"));

		return "administrador/homeAdmin";
	}

	@GetMapping("/cerrarSesion")
	public String cerrarSesion(HttpSession session) {

		session.removeAttribute("idUsuario");
		logger.info("Session : {}", session.getAttribute("idUsuario"));

		return "home/homeBook";

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
	public String editorial(Model model) {
		
		Editorial editorial = new Editorial();
		model.addAttribute("editorialForm",editorial);
		
		return "administrador/addEditorial";
	}
	
	@PostMapping("/saveEditorial")
	public String savedEditorial(Editorial editorial,Model model) {
		
		model.addAttribute("editorialForm",editorial);
		
		if (editorialServiceImpl.verificarEditorialExistente(editorial.getNombre())) {
			
			model.addAttribute("error", "Ya existe la editorial");
			return "administrador/addEditorial";
		}
		
		EditorialDTO editorialDTO=EditorialDTO.builder()
				.nombreDto(editorial.getNombre())
				.descripcionDto(editorial.getDescripcion())
				.ubicacionDto(editorial.getUbicacion())
				.build();
		
		editorialServiceImpl.agregarEditorial(editorialDTO);
		
		return "redirect:/admin/homeConfigurer";
		
	}

	@GetMapping("/formCategoria")
	public String categoria(Model model) {

		return "administrador/addCategoria";
	}

	@PostMapping("/guardarCategoria")
	public String guardarCategoria(@ModelAttribute CategoriaLibro categoriaLibro, Model model) {

		model.addAttribute("categoriaForm", categoriaLibro);

		CategoriaLibroDTO categoriaLibroDTO = CategoriaLibroDTO.builder().nombreDto(categoriaLibro.getNombre())
				.descripcionDto(categoriaLibro.getDescripcion()).build();

		Optional<CategoriaLibro> categoria = categoriaLibroServiceImpl
				.categoriaExistenteLibro(categoriaLibro.getNombre());

		if (categoria.isPresent()) {
			model.addAttribute("error", "Esta categoria ya existe");
			return "administrador/addCategoria";
		} else {

			categoriaLibroServiceImpl.crearCategoria(categoriaLibroDTO);

			return "redirect:/admin/formCategoria";
		}

	}

	@GetMapping("/formAutor")
	public String autor() {

		return "administrador/addAutor";

	}

	@GetMapping("/logistics")
	public String logistics() {

		return "administrador/logisticsBook";

	}

}