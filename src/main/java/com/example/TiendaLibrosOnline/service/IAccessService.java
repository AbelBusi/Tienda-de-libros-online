package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.dto.AccessDTO;
import com.example.TiendaLibrosOnline.model.entity.Access;

public interface IAccessService {
	
	Access guardarRolUsuario (AccessDTO accessDTO);

}