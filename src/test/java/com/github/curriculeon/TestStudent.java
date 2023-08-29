package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudent {

    //Remember GIVEN, WHEN, THEN

    @Test
    public void testIsLearner(){
        //Given
        Student student = new Student(null, "Dean");

        //When
        boolean isLearner = student instanceof Learner;

        //Then
        Assert.assertTrue(isLearner);
    }
    @Test
    public void testIsPerson(){
        //Given
        Student student = new Student(null, "Dean");

        //When
        boolean isPerson = student instanceof Person;

        //Then
        Assert.assertTrue(isPerson);
    }


    // Revisit with Leon

        @Test
    public void testLearn(){
        //Given
        Student student = new Student(null, "Dean");
        double numberOfHours = 100.0;
        double preStudyTime = student.getTotalStudyTime();
        double expectedTotalStudyTime = preStudyTime + numberOfHours;

        //When
        student.learn(numberOfHours);

        //Then
        Assert.assertEquals(expectedTotalStudyTime, student.getTotalStudyTime(), 0.001);
    }
}
