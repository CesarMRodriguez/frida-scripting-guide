package com.blog.testfrida.examples;

import com.blog.testfrida.complexobjects.Person;

public class ArrayTypes {

    public static int sumArray(int[] items) {
        int total = 0;
        for (int item : items) {
            total += item;
        }
        return total;
    }

    public static double sumArray(double[] items) {
        double total = 0;
        for (double item : items) {
            total += item;
        }
        return total;
    }

    public static int[] returnIntArray() {
        int[] constantArray = {1, 2, 3};
        return constantArray;
    }

    public static double[] returnDoubleArray() {
        double[] constantArray = {1.6, 2.9, 3.5};
        return constantArray;
    }

    public static double averagePersonAge(Person[] people) {
        double avg = 0.0;
        for (Person person: people) {
            avg += person.getAge();
        }
        return avg / people.length;
    }

    public static Person[] getAllPeople() {
        Person[] people = new Person[4];
        people[0] = new Person(1,"First",30);
        people[1] = new Person(2,"Second",25);
        people[2] = null;

        return people;
    }

}
