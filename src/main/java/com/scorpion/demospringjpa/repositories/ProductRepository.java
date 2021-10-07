package com.scorpion.demospringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scorpion.demospringjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
