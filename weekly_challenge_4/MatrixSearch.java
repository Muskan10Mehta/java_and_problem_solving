/*
 * Program to perform binary search in a M * N matrix.
 * @Muskan, 1910990681
 * Date: 15/10/2021
 * Weekly Challenge 4 Binary Search
 */

public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
    
        int r = A.size();
        int c = A.get(0).size();
        int mid;
        int i = 0;
        int j = 0;
        int left = 0; // starting index
        int right = (r * c) - 1; // ending index

        while(left <= right){
            mid = (left + right) / 2;

            //index in terms of row(i) and column(j)
            i = mid / c; 
            j = mid % c;

            if(A.get(i).get(j) == B){
                return 1;
            } else if(A.get(i).get(j) < B){
                left = mid + 1;
            } else if(A.get(i).get(j) > B){
                right = mid - 1;
            }
        }

        return 0;
    }
}

