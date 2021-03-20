package com.ginkei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ginkei.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
