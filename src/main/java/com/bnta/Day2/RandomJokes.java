// Prepare a random jokes generator
package com.bnta;


import java.util.Random;

public class RandomJokes {
    public static void main(String[] args) {
        String[] jokes =  {"When I wrote this code, only God and I understood what I did. Now only God " +
                                   "knows.",
                           "A son asked his father (a programmer) why the sun rises in the east, and sets in the " +
                                   "west. His response? It works, don’t touch!",
                           "How many programmers does it ","take to change a light bulb? None, that’s a hardware " +
                                   "problem.",
                           "Algorithm: Word used by programmers when they don’t want to explain what they did.",
                           "One man’s crappy software is another man’s full-time job.",
                           "It works on my machine.",
                           "Why do Java programmers have to wear glasses? Because they don’t C#.",
                           "Q: What did the Java code say to the C code? A: You’ve got no class."};
        Random rand = new Random();
        int j = rand.nextInt(jokes.length);
        System.out.println(jokes[j]);
    }

}
