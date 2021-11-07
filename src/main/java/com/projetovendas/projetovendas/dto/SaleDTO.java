package com.projetovendas.projetovendas.dto;

import java.time.LocalDate;

import com.projetovendas.projetovendas.entities.Sale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SaleDTO {
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO(Sale sale) {
		
		id = sale.getId();
		visited = sale.getVisited();
		deals = sale.getDeals();
		amount = sale.getAmount();
		date = sale.getDate();
		seller = new SellerDTO(sale.getSeller());
		
	}

}
