package com.example.espritexam1.controller;

import com.example.espritexam1.entites.User;
import com.example.espritexam1.service.IUserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class userController {

    @Autowired
    private IUserServices iUserServices;
    @PostMapping("/ajouteruser")
    public void addUser(@RequestBody User user){
        iUserServices.addUser(user);
    }
    @PostMapping("/assignProjectToUser")
    public void assignProjectToUser (int projectId, int userId){
        iUserServices.assignProjectToUser(projectId, userId);
    }
    @PostMapping("/assignProjectToUser")
    public void assignProjectToClient(int projectId, String firstName, String lastName){
        iUserServices.assignProjectToClient(projectId, firstName,lastName);
    }
}
