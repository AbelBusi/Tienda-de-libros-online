package com.example.TiendaLibrosOnline.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaLibroDTO {


    private String nombreDto;

    private String descripcionDto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoriaLibroDTO that)) return false;
        return Objects.equals(getNombreDto(), that.getNombreDto()) && Objects.equals(getDescripcionDto(), that.getDescripcionDto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombreDto(), getDescripcionDto());
    }
}
