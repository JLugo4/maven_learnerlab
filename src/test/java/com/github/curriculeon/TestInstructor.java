package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testIsInstructorIsTeacher(){
        //Given
        Instructor instructor = new Instructor(10000, "Leon");

        //When


        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testIsInstructorIsPerson(){
        //Given
        Instructor instructor = new Instructor(10001, "Noel");

        //When


        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeachInInstructor(){
        // Given

        //When

        //Then

    }

    @Test
    public void testLectureInInstructor(){
        // Given

        //When

        //Then

    }
}
