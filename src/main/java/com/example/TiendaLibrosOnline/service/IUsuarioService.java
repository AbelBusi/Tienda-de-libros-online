package com.example.TiendaLibrosOnline.service;

import java.util.Optional;

import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;

public interface IUsuarioService {

    Usuario crearUsuario(UsuarioDto usuarioDto);

    Integer eliminarUsuario(Integer idUxsuario);

    Usuario actualizarUsuario(UsuarioDto usuarioDto);


}
