package com.example.TiendaLibrosOnline.service;

import java.util.Optional;

import com.example.TiendaLibrosOnline.model.Usuario;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;

public interface IUsuarioService {

    Usuario crearUsuario(UsuarioDto usuarioDto);

    Integer eliminarUsuario(Integer idUxsuario);

    Usuario actualizarUsuario(UsuarioDto usuarioDto);

    Optional<Usuario> verificarUsuario(String emailUsuario);

}
