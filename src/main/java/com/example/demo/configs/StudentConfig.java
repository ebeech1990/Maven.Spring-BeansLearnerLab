package com.example.demo.configs;

import com.example.demo.models.Student;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        Students list = new Students(new ArrayList<>());
        list.add(new Student(1L, "Leslie"));
        return list;
    }
    @Bean(name = "previousStudents")
    public Students previousStudents(){
        Students list = new Students(new ArrayList<>());
        list.add(new Student(2L, "Ron"));
        return list;
    }

}
