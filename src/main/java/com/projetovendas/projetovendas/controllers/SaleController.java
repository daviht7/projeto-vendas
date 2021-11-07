package com.projetovendas.projetovendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetovendas.projetovendas.dto.SaleDTO;
import com.projetovendas.projetovendas.dto.SaleSuccessDTO;
import com.projetovendas.projetovendas.dto.SaleSumDTO;
import com.projetovendas.projetovendas.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	private SaleService salerService;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> salesDtos = salerService.findAll(pageable);
		return ResponseEntity.ok(salesDtos);
	}

	@GetMapping("/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> saleSumDtos = salerService.amountGroupedBySeller();
		return ResponseEntity.ok(saleSumDtos);
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
		List<SaleSuccessDTO> saleSumDtos = salerService.successGroupedBySeller();
		return ResponseEntity.ok(saleSumDtos);
	}

}
