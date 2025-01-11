package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;
import com.example.TiendaLibrosOnline.repository.IUsuarioRepository;
import com.example.TiendaLibrosOnline.service.IUsuarioService;


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
		if (usuarioDto == null) {
			logger.warn("Los datos del usuario estan vacios");
			throw new NullPointerException("No existen datos para el usuario");
		}

		Usuario usuario = Usuario.UserBuilders()
				.nombre(usuarioDto.getNombreDto())
				.apellido(usuarioDto.getApellidoDto())
				.fechaNacimiento(usuarioDto.getFechaNacimientoDto())
				.genero(usuarioDto.getGeneroDto())
				.direccion(usuarioDto.getDireccionDto())
				.telefono(usuarioDto.getTelefonoDto())
				.email(usuarioDto.getEmailDto())
				.password(usuarioDto.getPasswordDto())
				.build();

		try {


			usuarioRepository.save(usuario);
			logger.info("Usuario guardado con exito {}", usuario.getNombre());	

		} catch (RuntimeException e) {

			logger.error("No se guardo el USUARIO {}", usuario.getPassword());

			throw new RuntimeException("Error no se guardo el usuario");

		}
		
		return usuario;

	}

	@Override
	public Integer eliminarUsuario(Integer idUxsuario) {
		return null;
	}

	@Override
	public Usuario actualizarUsuario(UsuarioDto usuarioDto) {
		return null;
	}

	@Override
	public Usuario verificarUsuario(String emailUsuario) {

		if (emailUsuario==null ){

			logger.warn("El email y password de las validaciones estan vacias");
			throw  new RuntimeException("Error, no existen datos para validacion");
		}

		return usuarioRepository.findByEmail(emailUsuario);

	}

	@Override
	public Integer idUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.findByEmail(usuario.getEmail());
		Integer id= usuarioRepository.findByEmail(usuario.getEmail()).getIdUsuario();

		return id;
	}

}
