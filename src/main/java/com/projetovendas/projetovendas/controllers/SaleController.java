package com.projetovendas.projetovendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetovendas.projetovendas.dto.SaleDTO;
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

}
