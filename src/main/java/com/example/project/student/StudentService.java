package com.example.project.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//esse vai sera o java bean da nossa dependencia
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21)
        );
    }

}
