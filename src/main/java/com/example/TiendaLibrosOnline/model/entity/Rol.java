package com.example.TiendaLibrosOnline.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private String estado;
    
    @OneToMany(mappedBy = "rol",fetch =FetchType.LAZY)
    private List<Admin> admins;
    
    
    @ManyToMany(mappedBy = "roles")
    private Collection<Usuario> usuarioss;



}
