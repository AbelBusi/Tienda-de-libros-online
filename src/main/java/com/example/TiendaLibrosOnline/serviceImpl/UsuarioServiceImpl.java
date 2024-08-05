package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;
import com.example.TiendaLibrosOnline.repository.IUsuarioRepository;
import com.example.TiendaLibrosOnline.service.IUsuarioService;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	private final Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);


	@Override
    public Usuario crearUsuario(UsuarioDto usuarioDto) {
		Usuario usuario =null;
    	try {
    		
    		 usuario = Usuario.builder()
    				.nombre(usuarioDto.getNombreDto())
    				.apellido(usuarioDto.getApellidoDto())
    				.genero(usuarioDto.getGeneroDto())
    				.direccion(usuarioDto.getDireccionDto())
    				.telefono(usuarioDto.getTelefonoDto())
    				.fechaNacimiento(usuarioDto.getFechaNacimientoDto())
    				.email(usuarioDto.getEmailDto())
    				.password(usuarioDto.getPasswordDto()).
    				build();
    		 
    		 if(usuario==null) {
    				logger.info("No se guardo el USUARIO correctamente {}",usuario);			
    			 throw new NullPointerException("No se puede guardar un usuario vacio");
    		 }
    		 
    		 
    		logger.info("Usuario guardado con exito {}", usuario);
    		return usuarioRepository.save(usuario);
    		

		} catch (RuntimeException e) {
    		
			logger.info("No se guardo el USUARIO {}",usuario);			
			
			return new Usuario();
		
		}
    	
    }

	@Override
	public Integer eliminarUsuario(Integer idUxsuario) {
		return null;
	}

	@Override
	public Usuario actualizarUsuario(UsuarioDto usuarioDto) {
		return null;
	}

}
