package com.example.espritexam1.controller;

import com.example.espritexam1.entites.User;
import com.example.espritexam1.exceptions.EntityNotFoundException;
import com.example.espritexam1.service.IUserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class userController {

    @Autowired
    private IUserServices iUserServices;
    @PostMapping("/ajouteruser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<>(this.iUserServices.addUser(user), HttpStatus.CREATED);
    }
    @PostMapping(
            path = {"/{projectId}/{userId}"}
    )
    public ResponseEntity<User> assignProjectToUser(@PathVariable Integer projectId, @PathVariable Integer userId) throws EntityNotFoundException {
        this.iUserServices.assignProjectToUser(projectId, userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping(
            path = {"/{projectId}/{firstName}/{lastName}"}
    )
    public ResponseEntity<User> assignProjectToClient(@PathVariable Integer projectId, @PathVariable String firstName, @PathVariable String lastName) throws EntityNotFoundException {
        this.iUserServices.assignProjectToClient(projectId, firstName, lastName);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
