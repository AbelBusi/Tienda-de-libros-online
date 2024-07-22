package com.example.TiendaLibrosOnline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TiendaLibrosOnline.model.entity.Escritor;

@Repository
public interface IEscritorRepository extends JpaRepository<Escritor, Integer>{

}
