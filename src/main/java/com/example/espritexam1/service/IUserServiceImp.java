package com.example.espritexam1.service;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.entites.User;
import com.example.espritexam1.repository.ProjectRepository;
import com.example.espritexam1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImp implements IUserServices {
    @Autowired
    private UserRepository userRepository;
    private ProjectRepository projectRepository;
    @Override
    public void addUser(User u) {userRepository.save(u);}

    @Override
    public void assignProjectToUser(Integer projectId, Integer userId) {
        //récupération des objets
        // Etudiant etudiant = this.getById(etudiantId);
        Project project = projectRepository.findById(projectId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);
            //traitement
            project.setUsers();
            //saving
            userRepository.save(user);
    }
    @Override
    public void assignProjectToClient(Integer projectId, String firstName, String lastName){

    }

}
