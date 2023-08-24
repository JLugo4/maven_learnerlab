package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    // Remember GIVEN, WHEN, THEN

    @Test
    public void testPerson1() {
        //Given
        long expectedId = 12345;
        String expectedName = "Dean";

        //When
        Person person = new Person(expectedId, expectedName);

        //Then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName(){
        //Given
        String expectedName = "Andre";

        //When
        Person person = new Person(0, expectedName);
        person.setName("Andre");

        //Then
        Assert.assertEquals(expectedName, "Andre");

    }
}
