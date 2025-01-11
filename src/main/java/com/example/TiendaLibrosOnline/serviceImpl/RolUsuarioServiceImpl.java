package com.example.TiendaLibrosOnline.serviceImpl;

import javax.management.RuntimeErrorException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TiendaLibrosOnline.model.dto.AccessDTO;
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
	public Access guardarRolUsuario(AccessDTO accessDTO) {
		
		Access access = new Access();
		Usuario usuario= new Usuario();
		Rol rol = new Rol();
		
		if(accessDTO.getIdRol()==null && accessDTO.getIdUsuario()==null){
			throw new NullPointerException("El objeto se encuentra vacio");
		}
		
		try {
			
			usuario=Usuario.builder()
					.idUsuario(accessDTO.getIdUsuario())
					.build();
			
			rol = Rol.builder()
					.idRol(accessDTO.getIdRol())
					.build();
			
			access=Access.builder()
					.idRol(rol)
					.idUsuario(usuario)
					.vigente(true)
					.build();
			
		
			rol_UsuarioRepository.save(access);
		
		}catch (Exception e) {
			throw new RuntimeException("No se pudo ejecutar la funcion");
			
		}
		return access;
	}


}
