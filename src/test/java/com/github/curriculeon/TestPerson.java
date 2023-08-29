package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    // Remember GIVEN, WHEN, THEN

//    @Test
//    public void testPerson1() {
//        //Given
//        long expectedId = 12345;
//        String expectedName = "Dean";
//
//        //When
//        Person person = new Person(expectedId, expectedName);
//
//        //Then
//        Assert.assertEquals(expectedId, person.getId());
//        Assert.assertEquals(expectedName, person.getName());
//    }

    @Test
    public void testSetName(){
        //Given
        String expectedName = "Andre";
        Person person = new Person(null, null);
        Assert.assertNotEquals(expectedName, person.getName());

        //When

        person.setName("Andre");
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor(){
        //Given
        long expectedId = 1000;
        String expectedName = "Ciaffi";
        //When
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);

    }
}
