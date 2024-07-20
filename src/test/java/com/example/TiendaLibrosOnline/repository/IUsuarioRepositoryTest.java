package com.example.TiendaLibrosOnline.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.TiendaLibrosOnline.model.entity.Usuario;

/*Se implementa la metodologia agil de bdd para determinar como se comportara
 * el ´programa*/
/*Se implementa tdd para poner en desarrollo los tests unitarios*/
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)//Peemite hacer test con el gestor de datos incorporado
@DataJpaTest
class IUsuarioRepositoryTest {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	private Usuario usuario; 
	
	@BeforeEach
	void setup() {
		
		usuario = Usuario.builder()
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
	}

	@DisplayName("Test para verficar si funciona el save del repository usuario ")
	@Test
	void testGuardarUsuario() {
		
		//GIVEN: se describe las precondiciones necesarias para la ejecucion del escenario
		
		usuario = Usuario.builder()
				.nombre("Cesar Abel")
				.apellido("Bustamante Inoach")
				.genero("masculino")
				.direccion("Ciudad de dios mz A lote 9")
				.telefono("987 654 342")
				.fechaNacimiento(new Date())
				
				.build();
		
		//WHEN: se narran las acciones que hará el usuario en el sistema
		
		Usuario userTest = usuarioRepository.save(usuario);
		
		//THEN: se escriben las respuestas esperadas del sistema o validaciones
		assertAll(
				()-> assertThat(userTest).isNotNull(),
				()-> assertThat(userTest.getIdPersona()).isGreaterThan(0)
				);
	}

}
