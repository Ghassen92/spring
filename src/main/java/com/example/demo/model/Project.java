package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    @ManyToMany
    private List<User> users;
    @OneToMany
    private List<Sprint> sprints;

    public void addSprint(Sprint sprint) {
        if (sprints == null) sprints = new ArrayList<>();
        sprints.add(sprint);
    }

}
