package com.example.espritexam1.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Setter(AccessLevel.NONE)
    private int id;
    private String email;
    private String pwd;
    private String fname;
    private String iname;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany
    private List<Project> projects;
    @ManyToMany
    private List<Project> workProjects ;
}
