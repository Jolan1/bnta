/*Write a method that takes an input from the user. Either yes or no. If yes it displays a random joke. If no exits
 the program.*/

package com.bnta.Day2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] jokes = {"->When I wrote this code, only God and I understood what I did. Now only God knows. =D",
                          "->A son asked his father (a programmer) why the sun rises in the east, and sets in the west." +
                                  " His response? It works, don’t touch! =D",
                          "->How many programmers does it take to change a light bulb? None, that’s a hardware problem.=D",
                          "->Algorithm: Word used by programmers when they don’t want to explain what they did. =D",
                          "->One man’s crappy software is another man’s full-time job. =D ",
                          "->It works on my machine. ;D ",
                          "->Why do Java programmers have to wear glasses? Because they don’t C#. =D ",
                          "->Q: What did the Java code say to the C code? A: You’ve got no class.=D "};


        Random rand = new Random();
        int j = rand.nextInt(jokes.length);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you like Clean Code, yes or no?");
        String Answer = scanner.nextLine();
        if (Answer.equalsIgnoreCase("yes")) {
            System.out.println("All Clean Code fans deserve the finer things in life. So here's a joke: \n " + jokes[j]);
        } else {
            System.out.println("Only Clean Code fans get to enjoy laughter.No joke for you! ");
            System.out.println("Closing...");
            scanner.close();
            System.out.println("Closed.");

            //System.exit(status; 0);   Ask Nelson for more on how to use this and why. note: this brings an error
        }
    }
}


/*
 import package
line 11: create array of jokes (string format)
line 22: declare new random object
line 23: assign method to int variable to access all jokes using .length
line 25: declare new scanner
line; 27 assign Answer variable to the string input of user
ine 28 - 34: loop

system exit: to exit the whole programme (example closing an application i.e. Notion )scanner.close: closer the scanner
while loop: add while loop
*/
