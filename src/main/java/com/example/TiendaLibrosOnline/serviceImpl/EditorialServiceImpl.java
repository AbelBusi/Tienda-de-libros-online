package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.Editorial;
import com.example.TiendaLibrosOnline.model.dto.EditorialDTO;
import com.example.TiendaLibrosOnline.repository.IEditorialRepository;
import com.example.TiendaLibrosOnline.service.IEditorialService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditorialServiceImpl implements IEditorialService {

	@Autowired
	private IEditorialRepository editorialRepository;

	private final Logger logger = LoggerFactory.getLogger(EditorialServiceImpl.class);

	@Override
	public Editorial agregarEditorial(EditorialDTO editorialDto) {
		
		if(editorialDto==null) {
			logger.error("Error, no se puede agregar objetos vacios");
			throw new NullPointerException("No existen datos para continuar");
		}
		
		Editorial editorial=Editorial.builder()
				.nombre(editorialDto.getNombreDto())
				.descripcion(editorialDto.getDescripcionDto())
				.ubicacion(editorialDto.getUbicacionDto())
				.estado(true)
				.build();
		try {
			
			editorialRepository.save(editorial);
			logger.info("Se agrego correctamente la editorial");
		}catch (Exception e) {
			
			logger.error("Error: "+ e.getMessage());
			throw new RuntimeException("Error no se pudo guardar la editorial");
			
		} 
		
		return editorial;
		
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

	@Override
	public boolean verificarEditorialExistente(String nombreEstado) {
		// TODO Auto-generated method stub
		boolean estado;
		Optional<Editorial> ediOptional;

		if (nombreEstado == null || nombreEstado.isEmpty()) {
			throw new NullPointerException("No existe parametro para comprobar, nulo o vacio posiblemente");
		}

		try {

			ediOptional = editorialRepository.findByNombre(nombreEstado);

			if (ediOptional.isPresent()) {
				estado = true;
				logger.info("Ya existe una editorial");
			}
			else {
			estado = false;
			logger.info("No existe una editorial todavia");
			
			}

		} catch (Exception e) {
			// TODO: handle exception
			estado = true;
		}

		return estado;
	}
}
