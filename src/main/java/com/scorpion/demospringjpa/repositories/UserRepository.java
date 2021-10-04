package com.scorpion.demospringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scorpion.demospringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
