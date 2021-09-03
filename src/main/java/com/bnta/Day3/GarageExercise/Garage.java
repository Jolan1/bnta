package com.bnta.Day3;

import com.bnta.Day3.GarageExercise.Car;
import java.util.ArrayList;
import java.util.Objects;

public class Garage {
    public ArrayList<Car> carsInGarage;
    // private Door DOOR;

    //// I'm still not confident on when to pass parameters into Constructors, when to use void and when to return vs
    // print.

    public Garage() {
        this.carsInGarage = new ArrayList<Car>(); //Why was it not allowing me to add the enum door as a variable?
    }
    public Garage( ArrayList carsInGarage) {
        this.carsInGarage = new ArrayList<Car>(); //Why was it not allowing me to add the enum door as a variable?
    }

    public void addCarToGarage(Car car) {
        this.carsInGarage.add(car);
        System.out.println("The" + car.getMake() + " is now parked at the garage.");
    }

    public void removeCarFromGarage(Car car) {
        this.carsInGarage.remove(car);
        System.out.println("The" + car.getMake() + " is no longer parked in garage.");
    }

    public void countNumberOfCarsInGarage() {
        System.out.println("Currently there are " + this.carsInGarage.size() + " cars in the garage.");
    }

    public void listCarsInGarage() {
        System.out.println("You currently have the following cars parked in the garage:");
        for (int i = 0; i < this.carsInGarage.size(); i++){
            System.out.println( carsInGarage.get(i).getMake());
        }
    }

    public ArrayList<Car> getCarsInGarage() {
        return carsInGarage;
    }

    public void setCarsInGarage(ArrayList<Car> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carsInGarage=" + carsInGarage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Garage)) return false;
        Garage garage = (Garage) o;
        return Objects.equals(getCarsInGarage(), garage.getCarsInGarage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarsInGarage());
    }
}

  /* public boolean openDoor() {
        System.out.println("The" + this.DOOR + "is now opened.");
        return false;
    }

    public boolean closeDoor() {
        System.out.println("The" + this.DOOR + " is now closed.");
        return false;
    } */