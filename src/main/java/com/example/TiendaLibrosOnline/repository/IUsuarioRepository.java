package com.example.TiendaLibrosOnline.repository;

import com.example.TiendaLibrosOnline.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Integer, Usuario> {
}
