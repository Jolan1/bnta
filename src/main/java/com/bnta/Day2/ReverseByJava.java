// Write a method that reverses an array of Strings
// Reversing using Collections built-in function
package com.bnta;


import java.util.Arrays; // to enable Arrays.toString
import java.util.Collections; // to enable Collections.reverse

public class ReverseByJava {
    public static void main(String[] args) {
        String[] group5 = {"Busayo ", "Bianca ", "Cindy ", "Jessica "}; // create an array of strings
        System.out.println("Forward Group 5: " + Arrays.toString(group5));
        Collections.reverse(Arrays.asList(group5)); // reverse the array and ensure a list view of group5
        System.out.println("Reversed Group5: " + Arrays.toString(group5)); /* concatenate + return group 5 as string
        format */
    }
}
