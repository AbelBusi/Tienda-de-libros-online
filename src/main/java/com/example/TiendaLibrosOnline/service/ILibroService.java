package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.entity.Libro;
import com.example.TiendaLibrosOnline.model.dto.LibroDto;

import java.util.List;

public interface ILibroService {

    Libro agregarLibro(LibroDto libro);
    Libro actualizarLibro(LibroDto libro);
    List<Libro> mostrarLibro();
    void eliminarLibro(int libro);


}
