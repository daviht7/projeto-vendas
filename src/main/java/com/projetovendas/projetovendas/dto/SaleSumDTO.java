package com.projetovendas.projetovendas.dto;

import java.io.Serializable;

import com.projetovendas.projetovendas.entities.Seller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleSumDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO(Seller seller,Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

}
