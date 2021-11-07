package com.projetovendas.projetovendas.dto;

import java.io.Serializable;

import com.projetovendas.projetovendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SellerDTO implements Serializable {

	private static final long serialVersionUID = 1L; // garantir que o arquivo transporte bem em redes, seja convertido
														// em byte, boa medida

	private Long id;
	private String name;

	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}

}
