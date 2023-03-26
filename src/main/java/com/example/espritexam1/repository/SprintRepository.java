package com.example.espritexam1.repository;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.entites.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}
