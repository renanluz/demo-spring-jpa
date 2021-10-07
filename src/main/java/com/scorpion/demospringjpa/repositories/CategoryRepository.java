package com.scorpion.demospringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scorpion.demospringjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
