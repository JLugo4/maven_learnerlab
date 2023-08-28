package com.github.curriculeon;

public class Instructor extends Person implements Teacher{


    public Instructor(long id, String name) {
        super(id, name);
    }

    // What is wrong with .learn();
    @Override
    public void teach(Learner learner, double numberOfHours) {
        for (int i = 0; i < numberOfHours; i++) {
            learner.learn(numberOfHours);
        }
    }


    // What is wrong with .learn();
    @Override
    public void lecture(Learner[] learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learner.length;
        for (int i = 0; i < learner.length; i++) {
            for (int j = 0; j < numberOfHoursPerLearner; j++) {
                learner[i].learn(numberOfHours);
            }
        }

    }

}
