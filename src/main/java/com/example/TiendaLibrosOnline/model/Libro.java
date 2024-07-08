package com.example.TiendaLibrosOnline.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibro;

    private Integer idAutor;

    private Integer idEditorial;

    private Integer idCategoria;

    private Integer idUsuario;

    private String nombre;

    private String sipnosis;

    private double peso;

    private double alto;

    private double ancho;

    private Date fechaPublicacion;

    private int numeroPagina;

    private String ISBN;

}
