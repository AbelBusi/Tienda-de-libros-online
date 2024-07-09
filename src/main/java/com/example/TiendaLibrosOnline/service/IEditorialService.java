package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.entity.Editorial;
import com.example.TiendaLibrosOnline.model.dto.EditorialDTO;

import java.util.List;

public interface IEditorialService {

    Editorial agregarEditorial (EditorialDTO editorial);
    Editorial actualizarEditorial (EditorialDTO editorial);

    List<Editorial> mostrarEditorial();

    void eliminarEditorial(int idEditorial);
}
