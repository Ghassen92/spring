package com.example.demo.controller;

import com.example.demo.model.Project;
import com.example.demo.model.User;
import com.example.demo.service.ProjectService;
import com.example.demo.service.SprintService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class RestCont {
    @Autowired
    private UserService userService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private SprintService sprintService;

    @PostMapping("/users")
    public void addUser(User user) {
        userService.addUser(user);
    }

    @PostMapping("/projects")
    public void addProject(Project project) {
        projectService.addProject(project);
    }

    @PostMapping("/assignProjectToUser")
    public void assignProjectToUser(int projectId, int userId) {
        userService.addProject(userId, projectId);
    }

    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return projectService.getAll();
    }

    @GetMapping("/projects_filter")
    public List<Project> getProjectByUser(int userId) {
        return userService.getProjectsByUser(userId);
    }

    @PostMapping("/addSprint")
    public void addSprintAndAssignToProject(String description, Date startDate, int idProject) {
        sprintService.addSprint(description, startDate, idProject);
    }
}
