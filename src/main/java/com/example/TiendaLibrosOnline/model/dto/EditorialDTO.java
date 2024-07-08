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
public class EditorialDTO {

    private String nombreDto;
    private String descripcionDto;
    private String ubicacionDto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EditorialDTO that)) return false;
        return Objects.equals(getNombreDto(), that.getNombreDto()) && Objects.equals(getDescripcionDto(), that.getDescripcionDto()) && Objects.equals(getUbicacionDto(), that.getUbicacionDto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombreDto(), getDescripcionDto(), getUbicacionDto());
    }
}
