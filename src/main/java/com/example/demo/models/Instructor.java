package com.example.demo.models;

import com.example.demo.interfaces.Learner;
import com.example.demo.interfaces.Teacher;

import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher {


    public Instructor(Long ID, String name) {
        super(ID, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {

        for(Learner l : learners){
            l.learn(numberOfHours/getNumOfLearners(learners));

        }
    }

    public double getNumOfLearners(Iterable<? extends Learner> learners){
        return StreamSupport.stream(learners.spliterator(), false).count();
    }
}
