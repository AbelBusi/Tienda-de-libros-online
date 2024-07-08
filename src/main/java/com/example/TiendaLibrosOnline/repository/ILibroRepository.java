package com.example.TiendaLibrosOnline.repository;

import com.example.TiendaLibrosOnline.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro,Integer> {
}
