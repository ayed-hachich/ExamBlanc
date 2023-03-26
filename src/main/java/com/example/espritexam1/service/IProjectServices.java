package com.example.espritexam1.service;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.exceptions.EmptyException;

public interface IProjectServices {
    Project addProject(Project u) throws EmptyException;
}
