package com.example.demo.models;

import com.example.demo.interfaces.Learner;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student> implements Learner {

    private Double totalStudyTime;

    public Students(List<Student> list){
        super(list);
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }
}
