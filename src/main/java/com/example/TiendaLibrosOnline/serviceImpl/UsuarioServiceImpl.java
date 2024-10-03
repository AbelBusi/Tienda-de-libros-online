package com.example.TiendaLibrosOnline.serviceImpl;

import com.example.TiendaLibrosOnline.model.entity.Rol;
import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.model.dto.RolDto;
import com.example.TiendaLibrosOnline.model.dto.UsuarioDto;
import com.example.TiendaLibrosOnline.repository.IUsuarioRepository;
import com.example.TiendaLibrosOnline.service.IUsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    private final Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);


    @Override
    public Usuario crearUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = null;
        
        RolDto rolDto = RolDto.builder()
        		.idRol(2)
        		.build();
        
        Rol rol = Rol.builder()
        		.idRol(rolDto.getIdRol())
        		.build();
        
        try {

            usuario = Usuario.UserBuilder()
                    .nombre(usuarioDto.getNombreDto())
                    .apellido(usuarioDto.getApellidoDto())
                    .fechaNacimiento(usuarioDto.getFechaNacimientoDto())
                    .genero(usuarioDto.getGeneroDto())
                    .direccion(usuarioDto.getDireccionDto())
                    .telefono(usuarioDto.getTelefonoDto())
                    .email(usuarioDto.getEmailDto())
                    .password(usuarioDto.getPasswordDto())
                    .rol(rol)
                    .build();

            if (usuario == null) {
                logger.info("No se guardo el USUARIO correctamente {}", usuario.getPassword());
                throw new NullPointerException("No se puede guardar un usuario vacio");
            }


            logger.info("Usuario guardado con exito {}", usuario.getNombre());
            return usuarioRepository.save(usuario);


        } catch (RuntimeException e) {

            logger.info("No se guardo el USUARIO {}", usuario.getPassword());

            return new Usuario();

        }

    }

    @Override
    public Integer eliminarUsuario(Integer idUxsuario) {
        return null;
    }

    @Override
    public Usuario actualizarUsuario(UsuarioDto usuarioDto) {
        return null;
    }

}
