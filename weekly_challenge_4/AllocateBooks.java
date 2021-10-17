/*
 * Given an array of integers A of size N and an integer B.
 * College library has N bags,the ith book has A[i] number of pages.
 * You have to allocate books to B number of students so that maximum number of pages alloted to a student is minimum.
 * @Muskan, 1910990681
 * Date: 17/10/2021
 * Resources: geeksforgeeks
 * Weekly challenge 4 Binary search
 */

public class Solution {

    public boolean partitionPossible(ArrayList<Integer> A, int B, int mid){

        int students = 1;
        int possibleSum = 0;
        int i = 0;

        for(i = 0; i < A.size(); i++){

            if(A.get(i) > mid){
                return false;
            }

            if(possibleSum + A.get(i) > mid){
                students++;
                possibleSum = A.get(i);

                if(students > B){
                    return false;
                }
            }else{
                possibleSum += A.get(i);
            }
        }
        return true;
    }

    public int books(ArrayList<Integer> A, int B) {

        int result = 0;
        int left = 0;
        int mid = 0;
        int right = 0;
        long sum = 0;
        int i = 0;

        if(A.size() < B){
            return -1;
        }

        for(i = 0; i < A.size(); i++){
            sum = sum + A.get(i);
        }

        right = (int) sum;

        while(left <= right){

            mid = (left + right) / 2;

            if(partitionPossible(A, B, mid)){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return result;
    }
}

