package com.example.TiendaLibrosOnline.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TiendaLibrosOnline.model.entity.Access;
import com.example.TiendaLibrosOnline.model.entity.Rol;
import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.repository.IAccessRepository;
import com.example.TiendaLibrosOnline.service.IAccessService;


@Service
public class RolUsuarioServiceImpl implements IAccessService{
	
	@Autowired
	private IAccessRepository rol_UsuarioRepository;
	
	private final Logger logger = LoggerFactory.getLogger(RolUsuarioServiceImpl.class);

	@Override
	public Access guardarRolUsuario(Usuario usuaerio, Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}


}
