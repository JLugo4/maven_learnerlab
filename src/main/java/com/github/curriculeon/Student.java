package com.github.curriculeon;

public class Student extends Person implements Learner{

    // Instance Variable
    private double totalStudyTime;

    // Constructor
    public Student(Long id, String name) {
        super(id, name);
    }

    // Learner methods
    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }



    

}
