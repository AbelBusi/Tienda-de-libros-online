package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.CategoriaLibro;
import com.example.TiendaLibrosOnline.model.dto.CategoriaLibroDTO;
import com.example.TiendaLibrosOnline.repository.ICategoriaLibroRepository;
import com.example.TiendaLibrosOnline.service.ICategoriaLibroService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaLibroServiceImpl implements ICategoriaLibroService {

	@Autowired
	private ICategoriaLibroRepository categoriaLibroRepository;

	private final Logger logger = LoggerFactory.getLogger(CategoriaLibroServiceImpl.class);

	@Override
	public CategoriaLibro crearCategoria(CategoriaLibroDTO categoria) {

		if (categoria == null || categoria.getNombreDto() == null || categoria.getDescripcionDto() == null) {
			logger.warn("Los datos de la categoria estan vacios");
		}

		CategoriaLibro categoriaLibro = CategoriaLibro.builder().nombre(categoria.getNombreDto())
				.descripcion(categoria.getDescripcionDto()).build();

		try {

			categoriaLibroRepository.save(categoriaLibro);
			logger.info("Los datos de la categoria estan guardados correctamentes");

		} catch (Exception e) {

			logger.error("Los datos de la categoria no se pudieron guardar de forma correcta");
			throw new RuntimeException("Error al guardar la categoria");
		}
		return categoriaLibro;
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

	@Override
	public Optional<CategoriaLibro> categoriaExistenteLibro(String nombre) {
		
		return categoriaLibroRepository.findByNombre(nombre);
	}
}
