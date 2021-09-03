
package com.bnta;

public class reverseByManual2 {
    public static void main(String[] args) {
        String[] group5 = {"Busayo ", "Bianca ", "Cindy ", "Jessica "};
        for (int i = group5.length - 1; i >= 0; i--) {
           String reverseGroup5 = group5[i];
           System.out.println(reverseGroup5);
        }

    }
}
/*
System.out.println("Forward Group 5: " + Arrays.toString(group5));
System.out.println("Reversed Group5: " + Arrays.toString(reverseGroup5));
 line 6 : create an array of strings
 line 7 : create for loop where - the index will start at 4 up to where i is greater than or equal to 0 decreasing by
  1 each time (i.e. going backwards)
 QUESTION: Difference between --i and i-- :
If, for example, i = 5:
--i decrements i by 1 then gives you the value of i (4).
i-- gives you the value of i (5) then decrements it by 1.
Both will give you the same result in a for loop.
*/
