package com.example.espritexam1.controller;

import com.example.espritexam1.entites.Sprint;
import com.example.espritexam1.service.ISprintServiceImp;
import com.example.espritexam1.service.ISprintServices;
import com.example.espritexam1.service.IUserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = {"sprint"}
)
public class sprintController {
    @Autowired
    private ISprintServices iSprintService;

    @PostMapping
    public ResponseEntity<Sprint> saveUser(@RequestBody Sprint sprint) {
        return new ResponseEntity(this.iSprintService.addSprint(sprint), HttpStatus.CREATED);
    }
}
