package com.bnta.carManagement;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Full Name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your Driving Licence number:");
        String drivingLicence = scanner.nextLine();
        System.out.println("Thank you. Would you like to view the cars available? yes or no:");
        String Answer = scanner.nextLine();

        if (Answer.equalsIgnoreCase("yes")) {
         //   System.out.println( availableCars);
        } else {
            System.out.println( "Okay.Closing...");
            scanner.close();
            System.out.println("Closed.");
        scanner.close();
    }
}
}
