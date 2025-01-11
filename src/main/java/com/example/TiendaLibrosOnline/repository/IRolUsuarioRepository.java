package com.example.TiendaLibrosOnline.repository;

import com.example.TiendaLibrosOnline.model.entity.Rol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolUsuarioRepository extends JpaRepository<Rol,Integer> {

    Optional<Rol> findByIdRol (int idRol);

    		

}
