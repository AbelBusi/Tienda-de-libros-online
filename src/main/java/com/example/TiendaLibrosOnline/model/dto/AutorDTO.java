package com.example.TiendaLibrosOnline.model.dto;

import java.util.Date;
import java.util.Objects;

public class AutorDTO {

    private String nombreDto;
    private String apellidoDto;
    private String sexoDto;
    private Date fechaNacimientoDto;
    private String nacionalidadDto;
    private String religionDto;
    private String padresDto;
    private String hijosDto;
    private String educacionDto;
    private String ocupacionDto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutorDTO autorDTO)) return false;
        return Objects.equals(nombreDto, autorDTO.nombreDto) && Objects.equals(apellidoDto, autorDTO.apellidoDto) && Objects.equals(sexoDto, autorDTO.sexoDto) && Objects.equals(fechaNacimientoDto, autorDTO.fechaNacimientoDto) && Objects.equals(nacionalidadDto, autorDTO.nacionalidadDto) && Objects.equals(religionDto, autorDTO.religionDto) && Objects.equals(padresDto, autorDTO.padresDto) && Objects.equals(hijosDto, autorDTO.hijosDto) && Objects.equals(educacionDto, autorDTO.educacionDto) && Objects.equals(ocupacionDto, autorDTO.ocupacionDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDto, apellidoDto, sexoDto, fechaNacimientoDto, nacionalidadDto, religionDto, padresDto, hijosDto, educacionDto, ocupacionDto);
    }
}
