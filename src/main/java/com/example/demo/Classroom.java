package com.example.demo;

import com.example.demo.interfaces.Learner;
import com.example.demo.interfaces.Teacher;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;

public class Classroom {
    Students students;
    Instructors instructors;

    public Classroom(Instructors instructors, Students students){
        this.students = students;
        this.instructors = instructors;
    }


    public void hostLecture(Teacher teacher, Double numberOfHours){
            teacher.lecture((Iterable<? extends Learner>) students,numberOfHours);
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
