package com.example.TiendaLibrosOnline.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuario_Has_Rol")
public class UsuarioHasRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_userRol",nullable = false)
    private Integer idUserRol;

    @ManyToOne
    @JoinColumn(name = "usuario",nullable = false)
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name = "rol",nullable = false)
    private Rol idRol;

    @OneToMany(mappedBy = "userRol",fetch = FetchType.LAZY)
    private List<Libro> libros;

}
