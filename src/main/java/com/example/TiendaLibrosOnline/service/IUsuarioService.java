package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.Usuario;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;

public interface IUsuarioService {

    Usuario crearUsuario(UsuarioDto usuarioDto);

    Integer eliminarUsuario(Integer idUxsuario);

    Usuario actualizarUsuario(UsuarioDto usuarioDto);

    String verificarUsuario(String passUsuario);

}
