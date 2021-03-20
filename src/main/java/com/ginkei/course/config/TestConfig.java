package com.ginkei.course.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ginkei.course.entities.User;
import com.ginkei.course.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		var u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		var u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(List.of(u1, u2));
		
	}
	
	
	
	
}
