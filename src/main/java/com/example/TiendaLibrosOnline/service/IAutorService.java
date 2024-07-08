package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.Autor;
import com.example.TiendaLibrosOnline.model.dto.AutorDTO;

import java.util.List;

public interface IAutorService {

    Autor crearAutor(AutorDTO autor);
    Autor actualizarAutor(AutorDTO autor);
    List<Autor> mostrarAutor();
    void eliminarAutor(int idAutor);
}
