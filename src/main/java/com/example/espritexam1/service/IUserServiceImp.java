package com.example.espritexam1.service;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.entites.User;
import com.example.espritexam1.exceptions.EntityNotFoundException;
import com.example.espritexam1.exceptions.enums.ErrorCodes;
import com.example.espritexam1.repository.ProjectRepository;
import com.example.espritexam1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IUserServiceImp implements IUserServices {
    @Autowired
    private UserRepository userRepository;
    private ProjectRepository projectRepository;
    @Override
    public User addUser(User u) {return this.userRepository.save(u);}

    @Transactional
    public void assignProjectToUser(Integer projectId, Integer userId)  throws EntityNotFoundException {
        //récupération des objets
        // Etudiant etudiant = this.getById(etudiantId);
        // Project project = projectRepository.findById(projectId).orElse(null);
        // User user = userRepository.findById(userId).orElse(null);
        Project project = this.projectRepository.findById(projectId).orElseThrow(() ->
                new EntityNotFoundException("entity project with id " + projectId + " not found", ErrorCodes.ENTITY_NOT_FOUND)
        );
        User user = this.userRepository.findById(userId).orElseThrow(() ->
                new EntityNotFoundException("entity User with id = " + userId + " not found", ErrorCodes.ENTITY_NOT_FOUND)
        );
        user.getWorkProjects().add(project);
        //traitement
        // project.setUsers();
        //saving
        //  userRepository.save(user);
    }
    @Transactional
    public void assignProjectToClient(Integer projectId, String firstName, String lastName) throws EntityNotFoundException {
        Project project = this.projectRepository.findById(projectId).orElseThrow(() ->
                new EntityNotFoundException("entity project with id = " + projectId + " not found", ErrorCodes.ENTITY_NOT_FOUND)
        );
        User user = this.userRepository.findByFnameAndLname(firstName, lastName).orElseThrow(() ->
                new EntityNotFoundException("entity project with firstname = " + firstName + " and " + lastName + " not found", ErrorCodes.ENTITY_NOT_FOUND));
        user.getProjects().add(project);
    }

}
