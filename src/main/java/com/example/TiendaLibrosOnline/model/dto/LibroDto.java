package com.example.TiendaLibrosOnline.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LibroDto {

    private Integer idAutorDto;

    private Integer idEditorialDto;

    private Integer idCategoriaDto;

    private Integer idUsuarioDto;

    private String nombreDto;

    private String sipnosisDto;

    private double pesoDto;

    private double altoDto;

    private double anchoDto;

    private Date fechaPublicacionDto;

    private int numeroPaginaDto;

    private String ISBNDto;

}
