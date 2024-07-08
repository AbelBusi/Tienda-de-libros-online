package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.Autor;
import com.example.TiendaLibrosOnline.model.dto.AutorDTO;
import com.example.TiendaLibrosOnline.repository.IAutorRepository;
import com.example.TiendaLibrosOnline.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements IAutorService {

    @Autowired
    private IAutorRepository autorRepository;

    @Override
    public Autor crearAutor(AutorDTO autor) {
        return null;
    }

    @Override
    public Autor actualizarAutor(AutorDTO autor) {
        return null;
    }

    @Override
    public List<Autor> mostrarAutor() {
        return null;
    }

    @Override
    public void eliminarAutor(int idAutor) {

    }
}
