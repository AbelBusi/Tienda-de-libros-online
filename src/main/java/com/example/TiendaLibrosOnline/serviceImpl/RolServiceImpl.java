package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.Rol;
import com.example.TiendaLibrosOnline.repository.IRolUsuarioRepository;
import com.example.TiendaLibrosOnline.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolUsuarioRepository rolUsuarioRepository;

    @Override
    public Optional<Rol> verificarId(Integer inRol) {

        if (inRol==null){
            return Optional.empty();
        }

        return rolUsuarioRepository.findById(inRol);
    }

}
