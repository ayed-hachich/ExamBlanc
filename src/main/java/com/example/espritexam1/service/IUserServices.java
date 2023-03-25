package com.example.espritexam1.service;

import com.example.espritexam1.entites.User;

import java.util.List;

public interface IUserServices {
    void addUser(User u);
    void assignProjectToUser(Integer projectId,Integer userId);
    void assignProjectToClient(Integer projectId, String firstName, String lastName);
}
