package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String fName;
    private String IName;
    private Role role;
    @ManyToMany
    private List<Project> projects;


    public void addProject(Project project) {
        if (projects == null) projects = new ArrayList<>();
        projects.add(project);
    }
}
