package com.example.TiendaLibrosOnline.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;
import com.example.TiendaLibrosOnline.repository.IUsuarioRepository;
import com.example.TiendaLibrosOnline.serviceImpl.UsuarioServiceImpl;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

	@Mock
	private IUsuarioRepository usuarioRepository;

	@InjectMocks
	private UsuarioServiceImpl usuarioServiceImpl;

	private Usuario usuario;
	
	private UsuarioDto usuarioDTO;

	@BeforeEach
	void setup() {

		usuario= Usuario.builder()
				.nombre("Cesar Abel")
				.apellido("Bustamante Inoach")
				.genero("masculino")
				.direccion("Ciudad de dios mz A lote 9")
				.telefono("987 654 342")
				.fechaNacimiento(new Date())
				.email("cesarBustamante@Gmail.com")
				.password("trabalengua24")
				.rol("Admin")
				.build();
		
		usuarioDTO=UsuarioDto.builder()
    			.nombreDto(usuario.getNombre())
    			.apellidoDto(usuario.getApellido())
    			.generoDto(usuario.getGenero())
    			.direccionDto(usuario.getDireccion())
    			.telefonoDto(usuario.getTelefono())
    			.fechaNacimientoDto(usuario.getFechaNacimiento())
    			.emailDto(usuario.getEmail())
    			.passwordDto(usuario.getPassword())
				.build();	
		

	}

	@DisplayName("Test para guardar un empleado")
	@Test
	void testGuardarEmpleado() {
		// given
		given(usuarioRepository.findByEmail(usuario.getEmail())).willReturn(Optional.empty());
		
		given(usuarioRepository.save(usuario)).willReturn(usuario);
		
		// when
		
		Usuario usuarioGuardado = usuarioServiceImpl.crearUsuario(usuarioDTO);	
		
		// then
		
		assertThat(usuarioGuardado).isNotNull();
		
	}
	
	/*@DisplayName("Test para guardar un empleado con throw execption (evitar usuarios duplicados)")
	@Test
	void testUsuarioGuardadoThrowException() {
		
		//given
		
		given(usuarioRepository.findByEmail(usuario.getEmail()))
		.willReturn(Optional.of(usuario));
		
		//when
		
		assertThrows(RuntimeException.class, () -> {
			usuarioServiceImpl.crearUsuario(usuarioDTO);}
		);
		
		//then
		
		verify(usuarioRepository,never()).save(any(Usuario.class));
		
	}*/

}
