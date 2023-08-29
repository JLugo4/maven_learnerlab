package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestInstructors {
    @Test
    public void testConstructor(){
        //Given
        String[] expectedNames = "Leon, Hunter".split(",");

        //When
        List<String> nameList = Arrays
                .stream(Instructors.getInstance().toArray())
                .map(Person::getName)
                .collect(Collectors.toList());

        //Then
        for(String expectedName : expectedNames) {
            Assert.assertTrue(nameList.contains(expectedName));
        }

    }
}
