package com.example.espritexam1.service;

import com.example.espritexam1.entites.User;
import com.example.espritexam1.exceptions.EntityNotFoundException;

import java.util.List;

public interface IUserServices {
    User addUser(User u);
    void assignProjectToUser(Integer projectId,Integer userId) throws EntityNotFoundException;
    void assignProjectToClient(Integer projectId, String firstName, String lastName) throws EntityNotFoundException;
}
