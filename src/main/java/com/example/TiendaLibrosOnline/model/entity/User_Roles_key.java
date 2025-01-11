package com.example.TiendaLibrosOnline.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User_Roles_key  implements Serializable {

	@ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario idUser;

	@Override
	public int hashCode() {
		return Objects.hash(idUser, rol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User_Roles_key other = (User_Roles_key) obj;
		return Objects.equals(idUser, other.idUser) && Objects.equals(rol, other.rol);
	}

    

}
