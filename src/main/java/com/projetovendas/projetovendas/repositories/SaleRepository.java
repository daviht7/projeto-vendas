package com.projetovendas.projetovendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetovendas.projetovendas.dto.SaleSuccessDTO;
import com.projetovendas.projetovendas.dto.SaleSumDTO;
import com.projetovendas.projetovendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.projetovendas.projetovendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new com.projetovendas.projetovendas.dto.SaleSuccessDTO(obj.seller,SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
