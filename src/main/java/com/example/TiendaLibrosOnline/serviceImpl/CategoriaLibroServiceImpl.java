package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.CategoriaLibro;
import com.example.TiendaLibrosOnline.model.dto.CategoriaLibroDTO;
import com.example.TiendaLibrosOnline.repository.ICategoriaLibroRepository;
import com.example.TiendaLibrosOnline.service.ICategoriaLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaLibroServiceImpl implements ICategoriaLibroService {

    @Autowired
    private ICategoriaLibroRepository categoriaLibroRepository;

    @Override
    public CategoriaLibro crearCategoria(CategoriaLibroDTO categoria) {
        return null;
    }

    @Override
    public CategoriaLibro actualizarCategoria(CategoriaLibroDTO categoria) {
        return null;
    }

    @Override
    public List<CategoriaLibro> mostrarCategoria() {
        return null;
    }

    @Override
    public void eliminarCategoria(int idCategoria) {

    }
}
