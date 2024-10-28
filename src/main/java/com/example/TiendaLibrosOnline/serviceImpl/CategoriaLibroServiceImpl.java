package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.CategoriaLibro;
import com.example.TiendaLibrosOnline.controller.UserController;
import com.example.TiendaLibrosOnline.model.dto.CategoriaLibroDTO;
import com.example.TiendaLibrosOnline.repository.ICategoriaLibroRepository;
import com.example.TiendaLibrosOnline.service.ICategoriaLibroService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaLibroServiceImpl implements ICategoriaLibroService {

    @Autowired
    private ICategoriaLibroRepository categoriaLibroRepository;
    
	private final Logger logger = LoggerFactory.getLogger(CategoriaLibroServiceImpl.class);

    @Override
    public CategoriaLibro crearCategoria(CategoriaLibroDTO categoria) {
    	
    	CategoriaLibro categoriaLibro = null;
    	
    	try {
    		
    		categoriaLibro= CategoriaLibro.builder()
    				.nombre(categoria.getNombreDto())
    				.descripcion(categoria.getDescripcionDto())
    				.build();
    		
    		if(categoriaLibro==null) {
    			throw new NullPointerException("No se puede guardar un usuario vacio");
    		}
    		categoriaLibroRepository.save(categoriaLibro);
    		logger.info("Se guardo correctamente la categoria de libro");
    		
		} catch (Exception e) {
			
			logger.info("Error");
		}
    	
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
