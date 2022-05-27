package com.marwa.films.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marwa.films.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}
