package com.projetospringboot.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
