package com.example.TiendaLibrosOnline.model.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    @ManyToOne
    @JoinColumn(name = "id_userRol",nullable = false)
    private UsuarioHasRol userRol;

    @ManyToOne
    @JoinColumn(name = "autor",nullable = false)
    private Autor idAutor;

    @ManyToOne
    @JoinColumn(name = "editorial",nullable = false)
    private Editorial idEditorial;

    @ManyToOne
    @JoinColumn(name = "categoria",nullable = false)
    private CategoriaLibro idCategoria;


    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "sipnosis",nullable = false)
    private String sipnosis;

    @Column(name = "peso",nullable = false)
    private double peso;

    @Column(name = "alto",nullable = false)
    private double alto;

    @Column(name = "ancho",nullable = false)
    private double ancho;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_publicacion",nullable = false)
    private Date fechaPublicacion;

    @Column(name = "numero_pagimas",nullable = false)
    private int numeroPagina;

    @Column(name = "ISBN",nullable = false)
    private String ISBN;


}
