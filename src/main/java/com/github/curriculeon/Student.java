package com.github.curriculeon;

public class Student extends Person implements Learner{


    // Constructor
    public Student(long id, String name) {
        super(id, name);
    }

    // Learner methods
    @Override
    public void learn(double numberOfHours) {
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
    // Instance Variables
    double totalStudyTime;

    

}
