package com.projetovendas.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetovendas.projetovendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
