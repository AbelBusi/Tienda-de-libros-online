package com.example.TiendaLibrosOnline.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TiendaLibrosOnline.model.entity.Escritor;
import com.example.TiendaLibrosOnline.repository.IEscritorRepository;

@Service
public class exritorSerbiceImpl {
	
	@Autowired
	private IEscritorRepository escritorRepository;
	
	public Escritor guardarEscritor(Escritor escritor) {
		
		return escritorRepository.save(escritor);
		
	};

}
