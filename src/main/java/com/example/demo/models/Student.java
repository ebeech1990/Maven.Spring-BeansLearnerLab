package com.example.demo.models;

import com.example.demo.interfaces.Learner;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student(Long ID, String name) {
        super(ID, name);
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }
}
