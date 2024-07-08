package com.example.TiendaLibrosOnline.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
    @Column(name = "autor")
    private Autor idAutor;

    @Column(name = "editorial")
    private Editorial idEditorial;

    @Column(name = "categoria")
    private CategoriaLibro idCategoria;

    @Column(name = "usuario")
    private Usuario idUsuario;

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
