package com.devstudent.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudent.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
