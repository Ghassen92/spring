package com.example.demo;

import com.example.demo.service.ProjectService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private UserService userService;
    @Autowired
    private ProjectService projectService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
