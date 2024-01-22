package com.projetospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
