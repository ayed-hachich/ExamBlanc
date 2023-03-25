package com.example.espritexam1.entites;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private String description;
    @ManyToMany(mappedBy = "workProjects")
    private List<User> users ;
    @OneToMany(mappedBy = "project", cascade = CascadeType.PERSIST)
    private List<Sprint> sprints;


}
