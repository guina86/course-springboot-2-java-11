package com.ginkei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ginkei.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
