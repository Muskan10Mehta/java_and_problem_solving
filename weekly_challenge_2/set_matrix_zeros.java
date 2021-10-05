/* Given a matrix of size m x n of 0s and 1s, if an element is 0, set its entire row and column to 0.
 * @Muskan, 1910990681
 * Date: 05/10/2021
 * Weekly Challenge 2 Arrays
 */

public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        int i = 0;
        int j = 0;

        int k = 0;
        int l = 0;
	
	// to store distinct values of i an j where element is zero
        HashMap<Integer, Integer> zero_rows = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> zero_columns = new HashMap<Integer, Integer>();
	// store the row and column of element which is zero
        for(i = 0; i < a.size(); i++){
            for(j = 0; j < a.get(i).size(); j++){
                if(a.get(i).get(j) == 0){
                        zero_rows.put(i, 0);
                        zero_columns.put(j, 0);
                }
            }
        }

	// set the entire rows and columns to zero
        for(Integer x : zero_rows.keySet()){
            for(l = 0; l < a.get(x).size(); l++){
                a.get(x).set(l, 0);
            }
        }

        for(Integer y : zero_columns.keySet()){
            for(l = 0; l < a.size(); l++){
                a.get(l).set(y, 0);
            }
        }

	}
}

