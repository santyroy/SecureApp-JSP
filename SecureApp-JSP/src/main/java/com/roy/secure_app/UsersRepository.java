package com.roy.secure_app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
