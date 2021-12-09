package com.example.demo.service;

import com.example.demo.dao.ProjectRepository;
import com.example.demo.dao.SprintRepository;
import com.example.demo.model.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SprintService {

    @Autowired
    private SprintRepository sprintRepository;
    @Autowired
    private ProjectRepository projectRepository;

    public void addSprint(String description, Date startDate, int idProject) {
        Sprint sprint = new Sprint();
        sprint.setDescription(description);
        sprint.setStartDate(startDate);
        sprint.setProject(projectRepository.findById(idProject).get());
        sprintRepository.save(sprint);
    }
}
