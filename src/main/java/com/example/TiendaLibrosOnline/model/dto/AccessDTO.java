package com.example.TiendaLibrosOnline.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessDTO {
	
	private Integer idUsuario;
	private Integer idRol;
	

}
