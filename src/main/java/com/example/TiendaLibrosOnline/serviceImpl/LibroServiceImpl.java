package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.Libro;
import com.example.TiendaLibrosOnline.model.dto.LibroDto;
import com.example.TiendaLibrosOnline.repository.ILibroRepository;
import com.example.TiendaLibrosOnline.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements ILibroService {

    @Autowired
    private ILibroRepository libroRepository;

    @Override
    public Libro agregarLibro(LibroDto libro) {
        return null;
    }

    @Override
    public Libro actualizarLibro(LibroDto libro) {
        return null;
    }

    @Override
    public List<Libro> mostrarLibro() {
        return null;
    }

    @Override
    public void eliminarLibro(int libro) {

    }
}
