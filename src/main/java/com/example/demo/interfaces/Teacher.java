package com.example.demo.interfaces;

import com.example.demo.interfaces.Learner;

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, Double numberOfHours);
}
