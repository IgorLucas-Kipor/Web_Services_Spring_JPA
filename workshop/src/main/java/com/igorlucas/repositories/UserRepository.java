package com.igorlucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlucas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
