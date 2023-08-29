package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStudents {

    @Test
    public void testConstructor(){
        //Given
        String[] expectedNames = "Jarek,Andrew,Mary".split(",");

        //When
        List<String> nameList = new ArrayList<>();
        for(Student student : Students.getINSTANCE()){
            nameList.add(student.getName());
        }
//        List<String> nameList = Arrays
//                .stream(Students.getINSTANCE().toArray())
//                .map(Student::getName)
//                .collect(Collectors.toList());

        //Then
        for(String expectedName : expectedNames) {
            Assert.assertTrue(nameList.contains(expectedName));
        }

    }
}
