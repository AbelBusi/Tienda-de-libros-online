package com.example.TiendaLibrosOnline.controller;

import com.example.TiendaLibrosOnline.model.entity.Rol;
import com.example.TiendaLibrosOnline.serviceImpl.RolServiceImpl;
import com.example.TiendaLibrosOnline.serviceImpl.RolUsuarioServiceImpl;

import jakarta.servlet.http.HttpSession;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.model.dto.AccessDTO;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;
import com.example.TiendaLibrosOnline.serviceImpl.UsuarioServiceImpl;

@Controller
@RequestMapping("/usuario")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @Autowired
    private RolServiceImpl rolService;
    
    @Autowired
    private RolUsuarioServiceImpl rolUsuarioServiceImpl;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/ingresar")
    @ResponseStatus(HttpStatus.OK)
    public String iniciarSesion() {

        return "acceso/login";

    }

    @GetMapping("/crearCuenta")
    public String registrarUsuario(Model model) {

        Usuario usuario = new Usuario();

        model.addAttribute("usuarioForm", usuario);
        return "acceso/registerUser";
    }

    @PostMapping("/guardarUsuario")
    @ResponseStatus(HttpStatus.CREATED)
    public String guardarUsuario(Usuario usuario, Model model) {

        model.addAttribute("usuarioForm", usuario);

        Set<Rol> rols = new HashSet<Rol>();
        Rol rol = Rol.builder()
                .idRol(2)
                .build();
        rols.add(rol);
        Usuario u = usuarioService.verificarUsuario(usuario.getEmail());

        if (u != null) {
            logger.warn("El usuario ya existe y no puede ser creado");
            model.addAttribute("error", "Ya existe un usuario");
            return "acceso/registerUser";
        }

        UsuarioDto usuarioDTO = UsuarioDto.UserDTO()
                .nombreDto(usuario.getNombre())
                .apellidoDto(usuario.getApellido())
                .generoDto(usuario.getGenero())
                .direccionDto(usuario.getDireccion())
                .telefonoDto(usuario.getTelefono())
                .fechaNacimientoDto(usuario.getFechaNacimiento())
                .emailDto(usuario.getEmail())
                .passwordDto(bCryptPasswordEncoder.encode(usuario.getPassword()))
                .build();


        logger.info("Usuario: {}",usuarioDTO);

        usuarioService.crearUsuario(usuarioDTO);
        
        Integer id=usuarioService.idUsuario(usuario);
        
        AccessDTO accessDTO= AccessDTO.builder()
        		.idUsuario(id)
        		.idRol(2)
        		.build();
        
        rolUsuarioServiceImpl.guardarRolUsuario(accessDTO);
        
        return "home/homeBook";

    }

    @GetMapping("/cerrarSesion")
    public String cerrarSesion(HttpSession session) {

        session.removeAttribute("idUsuario");
        logger.info("Session : {}", session.getAttribute("idUsuario"));

        return "home/homeBook";

    }

}
