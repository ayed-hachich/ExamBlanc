package com.example.espritexam1.controller;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.entites.User;
import com.example.espritexam1.service.IProjectServices;
import com.example.espritexam1.service.IUserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("project")
@RequiredArgsConstructor
public class projectController {

    @Autowired
    private IProjectServices iProjectServices;
    @PostMapping("/ajouterproject")
    public void addProject(@RequestBody Project project){
        iProjectServices.addProject(project);
    }

}
