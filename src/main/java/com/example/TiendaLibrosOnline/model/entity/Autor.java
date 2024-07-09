package com.example.TiendaLibrosOnline.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

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

    @OneToMany(mappedBy = "idAutor")
    private List<Libro> libros;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor autor)) return false;
        return Objects.equals(getIdAutor(), autor.getIdAutor()) && Objects.equals(getNombre(), autor.getNombre()) && Objects.equals(getApellido(), autor.getApellido()) && Objects.equals(getSexo(), autor.getSexo()) && Objects.equals(getFechaNacimiento(), autor.getFechaNacimiento()) && Objects.equals(getNacionalidad(), autor.getNacionalidad()) && Objects.equals(getReligion(), autor.getReligion()) && Objects.equals(getPadres(), autor.getPadres()) && Objects.equals(getHijos(), autor.getHijos()) && Objects.equals(getEducacion(), autor.getEducacion()) && Objects.equals(getOcupacion(), autor.getOcupacion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdAutor(), getNombre(), getApellido(), getSexo(), getFechaNacimiento(), getNacionalidad(), getReligion(), getPadres(), getHijos(), getEducacion(), getOcupacion());
    }
}
