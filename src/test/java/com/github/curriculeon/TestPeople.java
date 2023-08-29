package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        //given
        People  people  = Instructors.getInstance();
        Instructor  person = new Instructor(null, null);
        Assert.assertFalse(people.contains(person));

        //When
        people.add(person);

        //Then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove(){
        //given
        People  people  = Students.getINSTANCE();
        Instructor  person = new Instructor(null, null);
        Assert.assertFalse(people.contains(person));

        //When
        people.remove(person);

        //Then
        Assert.assertTrue(!people.contains(person));
    }

    // RemoveByID


    @Test
    public void testFindById(){
        //given
        Long id = Long.MAX_VALUE;
        People  people  = Students.getINSTANCE();
        Student  person = new Student(id, null);
        people.add(person);
        Assert.assertFalse(people.contains(person));

        //When
        Person actualPerson = people.findByID(id);

        //Then
        Assert.assertEquals(person, actualPerson);
    }

}
