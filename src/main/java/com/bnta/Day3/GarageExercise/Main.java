//Model a car garage using classes. Use your imagination and think about the properties and behaviours. Note that you
// might want to create 2 class. One for Garage and another for Car. The garage holds a list of cars....

package com.bnta.Day3.GarageExercise;
import com.bnta.Day3.Garage;

public class Main {

    public static void main(String[] args) {
        Car gClass = new Car("Mercedes-Benz", 2020, 100000, "Black");
        Car modelSPlaid = new Car("Tesla",2021, 90000, "White" );
        Car rangeRover = new Car("Land Rover",2022, 83000, "Yellow" );
        System.out.println(gClass);
        System.out.println(modelSPlaid);
        System.out.println(rangeRover);
        System.out.println("\n");

        Garage homeGarage = new Garage();
        homeGarage.addCarToGarage(gClass);
        homeGarage.addCarToGarage(modelSPlaid);
        homeGarage.addCarToGarage(rangeRover);
        System.out.println("\n");

        homeGarage.countNumberOfCarsInGarage();
        System.out.println("\n");

        homeGarage.listCarsInGarage();
    }
}
//  System.out.println(homeGarage.openDoor());
//    System.out.println(homeGarage.closeDoor());
