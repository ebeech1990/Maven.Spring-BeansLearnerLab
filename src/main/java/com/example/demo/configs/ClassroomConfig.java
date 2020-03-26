package com.example.demo.configs;

import com.example.demo.Classroom;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @DependsOn({"instructors", "students"})
    @Bean(name = "currentCohort")
    public Classroom currentCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("students") Students students) {
        return new Classroom(instructors, students);
    }

    @DependsOn({"instructors", "previousStudents"})
    @Bean(name = "previousCohort")
    public Classroom previousCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("previousStudents") Students previousStudents) {
        return new Classroom(instructors, previousStudents);
    }
}
