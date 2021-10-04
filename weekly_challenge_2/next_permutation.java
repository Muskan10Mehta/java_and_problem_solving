/* Program to find the next permutation which is greater than the current number
 * @Muskan, 1910990681
 * Date: 04/10/2021
 * Weekly Challenge 2 Arrays
 */
public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {

        int size = A.size();
        int i = size - 1 ;
        int j = 0;
        int current;
        int next;
        int min_diff;
        int min;
        int temp;
        int count = 0;

        min = i;

        while(i > 0){

            current = A.get(i);
            next = A.get(i - 1);

            if(next < current){

                if(A.get(min) > next){

                    temp = next;
                    A.set(i - 1, A.get(min));
                    A.set(min, temp);

                }else{

                    min_diff = current - next;

                    for (j = i + 1; j < min; j++){

                        if((A.get(j) - next) < min_diff && A.get(j) - next > 0){
                            min_diff = A.get(j) - next;
                        }
                        else break;
                    }

                    temp = next;
                    A.set(i - 1, A.get(j - 1)) ;
                    A.set(j - 1, temp);
                    //count++;

                }

                if(count > 0){
                    //sort from i + 1 to min;
                    Collections.sort(A.subList(i, min + 1));
                    break;
                }
                else{

                    break;
                }

            }

            count++;
            i--;
        }

        if(count >= size - 1){
            Collections.sort(A);
        }

        return A;
    }
}

