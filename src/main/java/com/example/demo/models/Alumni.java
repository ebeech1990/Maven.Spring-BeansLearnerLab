//package com.example.demo.models;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
//@Component
//public class Alumni {
//
//    @Autowired
//    @Qualifier("previousStudents")
//    private Students previousStudents;
//
//    @Autowired
//    private Instructors instructors;
//
//    public Alumni(Instructors instructors, @Qualifier("previousStudents") Students previousStudents) {
//        this.instructors = instructors;
//        this.previousStudents = previousStudents;
//    }
//
//    @PostConstruct
//    public void executeBootCamp() {
//        for (Instructor instructor : instructors) {
//            instructor.lecture(previousStudents, (1200.0 * previousStudents.size()) / instructors.size());
//        }
//    }
//
//    public Students getPreviousStudents() {
//        return previousStudents;
//    }
//
//    public void setPreviousStudents(Students previousStudents) {
//        this.previousStudents = previousStudents;
//    }
//
//    public Instructors getInstructors() {
//        return instructors;
//    }
//
//    public void setInstructors(Instructors instructors) {
//        this.instructors = instructors;
//    }
//}
