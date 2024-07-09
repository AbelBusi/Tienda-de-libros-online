package com.example.TiendaLibrosOnline.repository;

import com.example.TiendaLibrosOnline.model.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEditorialRepository extends JpaRepository<Editorial,Integer> {
}
