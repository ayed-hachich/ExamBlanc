package com.example.espritexam1.repository;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    //lizmk t3ml bel keyword after > et before <
    List<Project> findBySprintStartDateAfter(Date date);
}
