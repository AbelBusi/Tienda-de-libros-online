package com.example.TiendaLibrosOnline.controller;

import com.example.TiendaLibrosOnline.serviceImpl.UserDetailsServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.TiendaLibrosOnline.model.entity.Escritor;
import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;
import com.example.TiendaLibrosOnline.serviceImpl.UsuarioServiceImpl;
import com.example.TiendaLibrosOnline.serviceImpl.exritorSerbiceImpl;



@Controller
@RequestMapping("/usuario")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UsuarioServiceImpl usuarioService;

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/ingresar")
    @ResponseStatus(HttpStatus.OK)
    public String iniciarSesion(Usuario usuario, HttpSession session){

		session.setAttribute("idUsuario",usuario.getIdUsuario());
    	
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
    	
    	UsuarioDto usuarioDTO = UsuarioDto.builder()
    			.nombreDto(usuario.getNombre())
    			.apellidoDto(usuario.getApellido())
    			.generoDto(usuario.getGenero())
    			.direccionDto(usuario.getDireccion())
    			.telefonoDto(usuario.getTelefono())
    			.fechaNacimientoDto(usuario.getFechaNacimiento())
    			.emailDto(usuario.getEmail())
    			.passwordDto(bCryptPasswordEncoder.encode(usuario.getPassword()))
    			.build();
    	usuarioService.crearUsuario(usuarioDTO);
    	
    	logger.info("Usuario {}",usuario);
    	logger.info("Usuario DTO{}",usuarioDTO);
    	
    	return "home/homeBook";
    }



}
