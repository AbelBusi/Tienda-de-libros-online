package com.example.TiendaLibrosOnline.repository;

import com.example.TiendaLibrosOnline.model.entity.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

	
	Usuario findByEmail(String email);

	//verificar correo y clave del usuario
	Optional<Usuario> findByEmailAndPassword(String email, String passoword);
	
}
