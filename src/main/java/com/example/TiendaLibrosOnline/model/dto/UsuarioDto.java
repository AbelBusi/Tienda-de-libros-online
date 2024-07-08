package com.example.TiendaLibrosOnline.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto{

    private String nombreDto;

    private String apellidoDto;

    private String generoDto;

    private String direccionDto;

    private String telefonoDto;

    private Date fechaNacimientoDto;

    private String emailDto;
    private String passwordDto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioDto that)) return false;
        return Objects.equals(getNombreDto(), that.getNombreDto()) && Objects.equals(getApellidoDto(), that.getApellidoDto()) && Objects.equals(getGeneroDto(), that.getGeneroDto()) && Objects.equals(getDireccionDto(), that.getDireccionDto()) && Objects.equals(getTelefonoDto(), that.getTelefonoDto()) && Objects.equals(getFechaNacimientoDto(), that.getFechaNacimientoDto()) && Objects.equals(getEmailDto(), that.getEmailDto()) && Objects.equals(getPasswordDto(), that.getPasswordDto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombreDto(), getApellidoDto(), getGeneroDto(), getDireccionDto(), getTelefonoDto(), getFechaNacimientoDto(), getEmailDto(), getPasswordDto());
    }
}
