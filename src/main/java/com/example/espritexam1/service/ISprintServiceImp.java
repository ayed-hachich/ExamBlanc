package com.example.espritexam1.service;

import com.example.espritexam1.entites.Sprint;
import com.example.espritexam1.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ISprintServiceImp implements ISprintServices {
    @Autowired
    private  SprintRepository sprintRepository;

    public Sprint addSprint(Sprint sprint) {
        return this.sprintRepository.save(sprint);
    }
}
