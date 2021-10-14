/*
 * Program to print out kth row of pascal triangle
 * @Muskan, 1910990681
 * Date: 14/10/2021
 * Weekly Challenge 2 Arrays
 */

public class Solution {
	public ArrayList<Integer> getRow(int A) {

        ArrayList<Integer> res = new ArrayList<Integer>(A+1);

        int prev = 1; //starting with nc0
        int curr;
        int i = 0;
        res.add(prev);

        for(i = 1; i <= A; i++){

            // using the formula for pascals triangle nCr = (nCr * (n - r + 1))/r
            curr = (prev * (A - i + 1)) / i;
            res.add(i, curr);
            prev = curr;
        }

        return res;
    }
}
