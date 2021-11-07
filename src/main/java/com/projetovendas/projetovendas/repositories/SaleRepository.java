package com.projetovendas.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetovendas.projetovendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
