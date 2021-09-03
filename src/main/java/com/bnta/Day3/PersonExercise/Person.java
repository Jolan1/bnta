package com.bnta;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
        //instance field
        private String firstName;
        private String lastName;
        private com.bnta.Gender Gender;
        private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, com.bnta.Gender gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        Gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public com.bnta.Gender getGender() {
        return Gender;
    }

    public void setGender(com.bnta.Gender gender) {
        Gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Gender=" + Gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && getGender() == person.getGender() && Objects.equals(getDateOfBirth(), person.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGender(), getDateOfBirth());
    }
}
