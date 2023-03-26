package com.example.espritexam1.service;

import com.example.espritexam1.entites.Project;
import com.example.espritexam1.repository.ProjectRepository;
import com.example.espritexam1.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.espritexam1.exceptions.EmptyException;
import com.example.espritexam1.exceptions.enums.ErrorCodes;

@Service
public class IProjectServiceImp implements IProjectServices {
    @Autowired
    private ProjectRepository projectRepository;
    private SprintRepository sprintRepository;
    @Override
    public Project addProject(Project project)  throws EmptyException  {
        // lizmna projet hka projet={id , sprint[{ },{ }]}récupération des Sprint
        if (project.getSprints()!=null && !project.getSprints().isEmpty()) {
            this.projectRepository.saveAndFlush(project);
            project.getSprints().forEach((s) -> {
                s.setProject(project);
            });
            return project;
        } else {
            throw new EmptyException("Sprints should not empty ", ErrorCodes.SHOULD_NOT_EMPTY);
        }

        }


}
