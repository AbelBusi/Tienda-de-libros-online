package com.example.TiendaLibrosOnline.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto{

    private String nombreDto;

    private String apellidoDto;

    private String generoDto;

    private String direccionDto;

    private String telefonoDto;

    private LocalDateTime fechaNacimientoDto;

    private String emailDto;
    private String passwordDto;

}
