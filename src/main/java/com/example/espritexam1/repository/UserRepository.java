package com.example.espritexam1.repository;

import com.example.espritexam1.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
