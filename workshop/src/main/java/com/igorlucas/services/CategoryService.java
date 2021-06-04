package com.igorlucas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorlucas.entities.Category;
import com.igorlucas.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository userRepository;

	public List<Category> findAll() {
		return userRepository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> user = userRepository.findById(id);
		return user.get();
	}

}
