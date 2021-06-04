package com.igorlucas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorlucas.entities.Order;
import com.igorlucas.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository userRepository;
	
	public List<Order> findAll() {
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = userRepository.findById(id);
		return user.get();
	}
	
	

}
