package com.example.TiendaLibrosOnline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TiendaLibrosOnline.model.entity.Access;

@Repository
public interface IAccessRepository extends JpaRepository<Access,Integer>{

}
