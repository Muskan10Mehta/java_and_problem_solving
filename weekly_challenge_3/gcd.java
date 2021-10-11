/*
 * Program to calculate greatest common divisor for given numbers
 * @Muskan, 1910990681
 * Date: 11/10/2021
 * Weekly Challenge 3 Math
 */

public class Solution {
    public int gcd(int A, int B) {

        int temp = 0;

        //using eclideans algorithm with modulous
        while(B != 0){
            temp = A;
            A = B;
            B = temp % B;
        }

        return A;
    }
}

 
