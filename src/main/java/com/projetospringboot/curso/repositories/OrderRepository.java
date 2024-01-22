package com.projetospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
