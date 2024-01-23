package com.projetospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
