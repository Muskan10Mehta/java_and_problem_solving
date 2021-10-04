/* Program to convert the given array into a wave array
 * @Muskan, 1910990681
 * Date: 04/10/2021
 * Weekly Challenge 2 Arrays
 */

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {

        int i = 0;
        int current;
        int next;
        int temp;
        
	// sort array
        Collections.sort(A);

	// swap two consecutive elements to make it wave array
        for(i = 0; i < A.size() - 1; i = i + 2){
            
	    current = A.get(i);
            next = A.get(i + 1);

            temp = current;
            A.set(i, next);
            A.set(i + 1, temp);

        }

        return A;
    }
}
