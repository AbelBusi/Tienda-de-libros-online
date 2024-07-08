package com.example.TiendaLibrosOnline.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "autor")
    private Integer idAutor;

    @Column(name = "editorial")
    private Integer idEditorial;

    @Column(name = "categoria")
    private Integer idCategoria;

    @Column(name = "usuario")
    private Integer idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "sipnosis")
    private String sipnosis;

    @Column(name = "peso")
    private double peso;

    @Column(name = "alto")
    private double alto;

    @Column(name = "ancho")
    private double ancho;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_publicacion")
    private Date fechaPublicacion;

    @Column(name = "numero_pagimas")
    private int numeroPagina;

    @Column(name = "ISBN")
    private String ISBN;

}
