package com.igorlucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlucas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
