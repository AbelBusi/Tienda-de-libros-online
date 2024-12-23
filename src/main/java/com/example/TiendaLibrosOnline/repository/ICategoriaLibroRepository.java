package com.example.TiendaLibrosOnline.repository;

import com.example.TiendaLibrosOnline.model.entity.CategoriaLibro;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaLibroRepository extends JpaRepository<CategoriaLibro,Integer> {
	
	Optional<CategoriaLibro> findByNombre(String nombre);
	
}
