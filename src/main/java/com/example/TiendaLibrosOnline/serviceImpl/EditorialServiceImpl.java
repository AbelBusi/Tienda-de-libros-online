package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.Editorial;
import com.example.TiendaLibrosOnline.model.dto.EditorialDTO;
import com.example.TiendaLibrosOnline.repository.IEditorialRepository;
import com.example.TiendaLibrosOnline.service.IEditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServiceImpl implements IEditorialService {

    @Autowired
    private IEditorialRepository editorialRepository;

    @Override
    public Editorial agregarEditorial(EditorialDTO editorial) {
        return null;
    }

    @Override
    public Editorial actualizarEditorial(EditorialDTO editorial) {
        return null;
    }

    @Override
    public List<Editorial> mostrarEditorial() {
        return null;
    }

    @Override
    public void eliminarEditorial(int idEditorial) {

    }
}
