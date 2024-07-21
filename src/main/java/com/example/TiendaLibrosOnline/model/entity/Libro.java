package com.example.TiendaLibrosOnline.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
import java.util.Objects;

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

    @ManyToOne
    @JoinColumn(name = "autor",nullable = false)
    private Autor idAutor;

    @ManyToOne
    @JoinColumn(name = "editorial",nullable = false)
    private Editorial idEditorial;

    @ManyToOne
    @JoinColumn(name = "categoria",nullable = false)
    private CategoriaLibro idCategoria;

    @ManyToOne
    @JoinColumn(name = "usuario",nullable = false)
    private Usuario idUsuario;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return Double.compare(libro.getPeso(), getPeso()) == 0 && Double.compare(libro.getAlto(), getAlto()) == 0 && Double.compare(libro.getAncho(), getAncho()) == 0 && getNumeroPagina() == libro.getNumeroPagina() && Objects.equals(getIdLibro(), libro.getIdLibro()) && Objects.equals(getIdAutor(), libro.getIdAutor()) && Objects.equals(getIdEditorial(), libro.getIdEditorial()) && Objects.equals(getIdCategoria(), libro.getIdCategoria()) && Objects.equals(getIdUsuario(), libro.getIdUsuario()) && Objects.equals(getNombre(), libro.getNombre()) && Objects.equals(getSipnosis(), libro.getSipnosis()) && Objects.equals(getFechaPublicacion(), libro.getFechaPublicacion()) && Objects.equals(getISBN(), libro.getISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdLibro(), getIdAutor(), getIdEditorial(), getIdCategoria(), getIdUsuario(), getNombre(), getSipnosis(), getPeso(), getAlto(), getAncho(), getFechaPublicacion(), getNumeroPagina(), getISBN());
    }
}
