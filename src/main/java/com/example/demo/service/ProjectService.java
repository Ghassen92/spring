package com.example.demo.service;

import com.example.demo.dao.ProjectRepository;
import com.example.demo.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public List<Project> getAll() {
        return projectRepository.findAll();
    }
}
