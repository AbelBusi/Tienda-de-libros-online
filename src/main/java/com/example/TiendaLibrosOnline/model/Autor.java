package com.example.TiendaLibrosOnline.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    private String nombre;
    private String apellido;
    private String sexo;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String religion;
    private String padres;
    private String hijos;
    private String educacion;
    private String ocupacion;
}
