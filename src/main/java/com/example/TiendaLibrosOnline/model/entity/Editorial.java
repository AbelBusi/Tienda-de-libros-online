package com.example.TiendaLibrosOnline.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Editorial")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_editorial")
    private Integer idEditorial;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ubicacion")
    private String ubicacion;
    
    @Column(name = "estado")
    private boolean estado;
    
    @OneToMany(mappedBy = "idEditorial")
    private List<Libro> libros;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Editorial editorial)) return false;
        return Objects.equals(getIdEditorial(), editorial.getIdEditorial()) && Objects.equals(getNombre(), editorial.getNombre()) && Objects.equals(getDescripcion(), editorial.getDescripcion()) && Objects.equals(getUbicacion(), editorial.getUbicacion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEditorial(), getNombre(), getDescripcion(), getUbicacion());
    }
}
