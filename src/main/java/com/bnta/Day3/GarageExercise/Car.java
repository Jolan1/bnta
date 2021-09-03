//Model a car garage using classes. Use your imagination and think about the properties and behaviours. Note that you
// might want to create 2 class. One for Garage and another for Car. The garage holds a list of cars....


package com.bnta.Day3.GarageExercise;

public class Car {
   private String make;
   private int year;
   private int price;
   private String colour;

   public Car(String make, int year, int price, String colour) {

      this.make = make;
      this.year = year;
      this.price = price;
      this.colour = colour;
   }

   public String getMake() {
      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   @Override
   public String toString() {
      return "Car{" +
              "make='" + make + '\'' +
              ", year=" + year +
              ", price=" + price +
              ", colour=" + colour +
              '}';
   }
}
