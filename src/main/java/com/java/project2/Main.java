package com.java.project2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Kornel",1992);
        Person person2 = new Person("Andrzej",1984);
        Person person3 = new Person("Mariola",1980);


        System.out.println(person1.getName());
        System.out.println(person1.getYearOfBirth());
        person1.tellAboutYourself();
        person2.setName("Ziomek");
        person2.tellAboutYourself();
        person3.tellAboutYourself();
    }
}
