package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.entity.Rol;

import java.util.Optional;

public interface IRolService {

    Optional<Rol> verificarId(Integer inRol);
    

}
