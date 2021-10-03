/* Program to create an array of squares of all elements in the given element in sorted order
 * @Muskan, 1910990681
 * Date: 3/10/2021
 * Weekly Challenge 2 Arrays
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> res = new ArrayList<Integer> ();

        int i = A.size() - 1;
        int j = 0;

        while (i >= j){

            if(Math.abs(A.get(j)) > Math.abs(A.get(i))){
                res.add(0, Math.abs(A.get(j) * A.get(j)));
                j++;
            }else{
                res.add(0, Math.abs(A.get(i) * A.get(i)));
                i--;
            }

        }

        return res;
    }
}

