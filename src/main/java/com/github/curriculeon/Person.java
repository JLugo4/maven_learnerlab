package com.github.curriculeon;

public class Person {

    // Declaring Variables
    final long id;
    String name;

    // Constructor
    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    // GETTERS AND SETTERS
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // END. GETTERS AND SETTERS
}
