package com.ginkei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ginkei.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
