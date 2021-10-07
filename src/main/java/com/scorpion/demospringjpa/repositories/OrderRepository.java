package com.scorpion.demospringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scorpion.demospringjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
