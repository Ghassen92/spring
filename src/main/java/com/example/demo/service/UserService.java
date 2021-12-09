package com.example.demo.service;

import com.example.demo.dao.ProjectRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.model.Project;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProjectRepository projectRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void addProject(int userId, int projectId) {
        User user = userRepository.findById(userId).get();
        Project project = projectRepository.findById(projectId).get();
        if (user != null && project != null) {
            user.addProject(project);
            userRepository.save(user);
        }
    }

    public List<Project> getProjectsByUser(int userId) {
        User user = userRepository.findById(userId).get();
        if (user != null){
            return user.getProjects();
        }
        else return null;
    }
}
