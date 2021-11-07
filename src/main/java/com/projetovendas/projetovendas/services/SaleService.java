package com.projetovendas.projetovendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetovendas.projetovendas.dto.SaleDTO;
import com.projetovendas.projetovendas.entities.Sale;
import com.projetovendas.projetovendas.repositories.SaleRepository;
import com.projetovendas.projetovendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;

	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		
		sellerRepository.findAll();

		Page<Sale> sales = saleRepository.findAll(pageable);
		return sales.map(sale -> new SaleDTO(sale));
	}

}
