package com.example.TiendaLibrosOnline.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroDto libroDto)) return false;
        return Double.compare(libroDto.getPesoDto(), getPesoDto()) == 0 && Double.compare(libroDto.getAltoDto(), getAltoDto()) == 0 && Double.compare(libroDto.getAnchoDto(), getAnchoDto()) == 0 && getNumeroPaginaDto() == libroDto.getNumeroPaginaDto() && Objects.equals(getIdAutorDto(), libroDto.getIdAutorDto()) && Objects.equals(getIdEditorialDto(), libroDto.getIdEditorialDto()) && Objects.equals(getIdCategoriaDto(), libroDto.getIdCategoriaDto()) && Objects.equals(getIdUsuarioDto(), libroDto.getIdUsuarioDto()) && Objects.equals(getNombreDto(), libroDto.getNombreDto()) && Objects.equals(getSipnosisDto(), libroDto.getSipnosisDto()) && Objects.equals(getFechaPublicacionDto(), libroDto.getFechaPublicacionDto()) && Objects.equals(getISBNDto(), libroDto.getISBNDto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdAutorDto(), getIdEditorialDto(), getIdCategoriaDto(), getIdUsuarioDto(), getNombreDto(), getSipnosisDto(), getPesoDto(), getAltoDto(), getAnchoDto(), getFechaPublicacionDto(), getNumeroPaginaDto(), getISBNDto());
    }
}
