package com.saledro.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saledro.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
		
}
