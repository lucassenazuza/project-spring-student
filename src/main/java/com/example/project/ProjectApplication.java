package com.example.project;

import com.example.project.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }


}
