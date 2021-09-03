// Write a method that reverses an array of Strings
// reverse using for loop -
package com.bnta;



public class ReverseByManual {
    public static void main(String[] args) {
        String[] group5 = {"Busayo ", "Bianca ", "Cindy ", "Jessica "}; // create an array of strings
        for (int i = 0; i < group5.length; i++) { // create for loop to reverse every string in group 5
            String reverseGroup5 = group5[group5.length - i -1]; //create new string and assign the reversed arrays
            System.out.println(reverseGroup5);
        }
    }
}
//System.out.println("Forward Group 5: " + Arrays.toString(group5)); /* concatenate + return group 5 as string format */
//System.out.println("Reversed Group5: " + Arrays.toString(reverseGroup5));

// this draft does extra work on line 11 as line 11 can be implemented in line 1o and then remove line 11.