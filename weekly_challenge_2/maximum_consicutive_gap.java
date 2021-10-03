/* Program to find maximum consicutive gap in a sorted array
 * @Muskan, 1910990681
 * Date : 03/10/2021
 * Weekly Challenge 2 Arrays
 */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {

        if(A.size() < 2 ){
            return 0;
        }

        int i;
        int max = 0;
        int current = 0;
        int next = 0;

        Collections.sort(A);

        for (i = 0; i < A.size() - 1; i++){

            current = A.get(i);
            next = A.get(i + 1);

            if(Math.abs(next - current) > max){
                max = Math.abs(next - current);

            }
        } 

        return max;
    }
}

