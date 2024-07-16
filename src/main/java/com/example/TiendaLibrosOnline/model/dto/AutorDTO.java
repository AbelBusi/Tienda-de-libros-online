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
    private String padreDto;
    private String madreDto;
    private String hijosDto;
    private String educacionDto;
    private String ocupacionDto;
	@Override
	public int hashCode() {
		return Objects.hash(apellidoDto, educacionDto, fechaNacimientoDto, hijosDto, madreDto, nacionalidadDto,
				nombreDto, ocupacionDto, padreDto, religionDto, sexoDto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutorDTO other = (AutorDTO) obj;
		return Objects.equals(apellidoDto, other.apellidoDto) && Objects.equals(educacionDto, other.educacionDto)
				&& Objects.equals(fechaNacimientoDto, other.fechaNacimientoDto)
				&& Objects.equals(hijosDto, other.hijosDto) && Objects.equals(madreDto, other.madreDto)
				&& Objects.equals(nacionalidadDto, other.nacionalidadDto) && Objects.equals(nombreDto, other.nombreDto)
				&& Objects.equals(ocupacionDto, other.ocupacionDto) && Objects.equals(padreDto, other.padreDto)
				&& Objects.equals(religionDto, other.religionDto) && Objects.equals(sexoDto, other.sexoDto);
	}
    
    
}
