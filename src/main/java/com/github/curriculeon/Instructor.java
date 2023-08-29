package com.github.curriculeon;

public class Instructor extends Person implements Teacher{


    public Instructor(Long id, String name) {
        super(id, name);
    }

    // What is wrong with .learn();
    @Override
    public void teach(Learner learner, double numberOfHours) {
            learner.learn(numberOfHours);
    }


    // What is wrong with .learn();
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner learner : learners){
            teach(learner, numberOfHoursPerLearner);
        }
    }
}
