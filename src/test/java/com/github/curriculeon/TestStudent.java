package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudent {

    //Remember GIVEN, WHEN, THEN

    @Test
    public void testIsLearner(){
        //Given
        Student student = new Student(10000, "Dean");

        //When


        //Then
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testIsPerson(){
        //Given
        Student student = new Student(10000, "Dean");

        //When


        //Then
        Assert.assertTrue(student instanceof Person);
    }


    // Revisit with Leon

    //    @Test
//    public void testLearn(){
//        //Given
//        Student student = new Student(10000, "Dean");
//
//        //When
//        student.learn(10.0);
//        student.learn(8.0);
//
//        //Then
//        double totalStudyTime = student.getTotalStudyTime();
//        Assert.assertEquals(18.0, totalStudyTime);
//    }
}
