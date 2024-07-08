package com.example.TiendaLibrosOnline.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private Integer idAutor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "sexo")
    private String sexo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "religion")
    private String religion;

    @Column(name = "padres")
    private String padres;

    @Column(name = "hijos")
    private String hijos;

    @Column(name = "educacion")
    private String educacion;

    @Column(name = "ocupacion")
    private String ocupacion;
}
