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
        return 0;
    }
    // Instance Variables
    double totalStudyTime;

    

}
