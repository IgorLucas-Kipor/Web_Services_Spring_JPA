package com.igorlucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlucas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
