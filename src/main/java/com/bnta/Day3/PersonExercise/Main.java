/* 1 - Create a class that models a person with the following characteristics.
- firstName
- lastName
- gender
- dateOfBirth
*/
package com.bnta.Day3.PersonExercise;

import com.bnta.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");

        Person aunt = new Person("Mary", "Sanderson", com.bnta.Gender.FEMALE, LocalDate.of(1980, 8, 8) );
        System.out.println("This person is called " + aunt.getFirstName() + " " + aunt.getLastName()+ ".");
        System.out.println(aunt.getFirstName() + " " + aunt.getLastName() + " identifies as " + aunt.getGender() +
                        " and her birthday is " + LocalDate.of(1980, 8 , 8) + ".");
        System.out.println("\n");
        Person uncle = new Person("Luke", "Sanderson", com.bnta.Gender.MALE, LocalDate.of(1982, 2,
                2) );
        System.out.println("This person is called " + uncle.getFirstName() + " " +uncle.getLastName() + ".");
        System.out.println(uncle.getFirstName() + " " + uncle.getLastName() + " identifies as " + uncle.getGender() +  " and his birthday is " + LocalDate.of(1982, 10 , 8) +
                ".");
    }
}

// Notes from nelson: 1)Create an Enum for each new gender (please note the above code is yest to apply this)