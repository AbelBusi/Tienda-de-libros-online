package com.example.TiendaLibrosOnline.repository;

import com.example.TiendaLibrosOnline.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor,Integer> {
}
