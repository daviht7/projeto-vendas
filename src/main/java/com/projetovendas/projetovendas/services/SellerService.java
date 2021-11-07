package com.projetovendas.projetovendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetovendas.projetovendas.dto.SellerDTO;
import com.projetovendas.projetovendas.entities.Seller;
import com.projetovendas.projetovendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	public List<SellerDTO> findAll() {

		List<Seller> sellers = sellerRepository.findAll();
		List<SellerDTO> sellersDTO = sellers.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
		return sellersDTO;

	}

}
