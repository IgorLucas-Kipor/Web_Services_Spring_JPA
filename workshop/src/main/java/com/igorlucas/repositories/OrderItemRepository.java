package com.igorlucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlucas.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
