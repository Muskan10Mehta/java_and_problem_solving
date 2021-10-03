/* Program to find duplicates in array
 * @Muskan, 1910990681
 * Date: 3/10/2021
 * Weekly Challenge 2 Arrays
 */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {

        int i = 0;
        int key = 0;
        int value = 0;
        HashMap<Integer, Integer> duplicate = new HashMap<Integer, Integer>();

        for(i = 0; i < A.size(); i++){
            key = A.get(i);
            if(duplicate.containsKey(key)){
                value = duplicate.get(key);
                duplicate.put(key, value + 1);
            } else{
                duplicate.put(key, 1);
            }

        }

        for(HashMap.Entry<Integer,Integer> entry : duplicate.entrySet()){
            if(entry.getValue()> 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}

