package com.ginkei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ginkei.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
