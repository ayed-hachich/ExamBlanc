package com.example.espritexam1.service;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.entites.Sprint;
import com.example.espritexam1.entites.User;
import com.example.espritexam1.repository.ProjectRepository;
import com.example.espritexam1.repository.SprintRepository;
import com.example.espritexam1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IProjectServiceImp implements IProjectServices {
    @Autowired
    private ProjectRepository projectRepository;
    private SprintRepository sprintRepository;
    @Override
    public void addProject(Project project) {
        // lizmna projet hka projet={id , sprint[{ },{ }]}récupération des Sprint
        if (project.getSprints()!=null) {

        }

        Sprint sprint = sprintRepository.findById(projectId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);
        //traitement
        project.setUsers();
        //saving
        userRepository.save(user);



        projectRepository.save(p);}
}
