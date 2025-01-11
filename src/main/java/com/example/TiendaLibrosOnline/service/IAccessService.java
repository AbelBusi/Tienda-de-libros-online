package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.entity.Access;
import com.example.TiendaLibrosOnline.model.entity.Rol;
import com.example.TiendaLibrosOnline.model.entity.Usuario;

public interface IAccessService {
	
	Access guardarRolUsuario (Usuario usuaerio, Rol rol);

}