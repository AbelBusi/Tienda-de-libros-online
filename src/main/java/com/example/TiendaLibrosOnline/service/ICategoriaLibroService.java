package com.example.TiendaLibrosOnline.service;

import com.example.TiendaLibrosOnline.model.entity.CategoriaLibro;
import com.example.TiendaLibrosOnline.model.dto.CategoriaLibroDTO;

import java.util.List;
import java.util.Optional;

public interface ICategoriaLibroService {

    CategoriaLibro crearCategoria(CategoriaLibroDTO categoria);
    CategoriaLibro actualizarCategoria(CategoriaLibroDTO categoria);
    List<CategoriaLibro> mostrarCategoria();
    void eliminarCategoria(int idCategoria);
    Optional<CategoriaLibro> categoriaExistenteLibro (String nombre); 
    
    
}
