package com.example.demo.configs;

import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        Instructors list = new Instructors(new ArrayList<>());
        list.add(new Instructor(1L, "April"));
        return list;
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        Instructors list = new Instructors(new ArrayList<>());
        list.add(new Instructor(2L, "Tom"));
        list.add(new Instructor(4L, "Donna"));
        return list;
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors getAllZipCodeInstructors(){
        Instructors list = new Instructors(new ArrayList<>());
        list.add(new Instructor(3L, "GaryJerry"));
        list.add(new Instructor(5L, "Craig"));
        return list;
    }
}
