package com.java.project2;

public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public Person() {
    }

    public void tellAboutYourself() {
        System.out.println("Hi! My name is " + name + " and I'm " + (2022-yearOfBirth) + " old.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
