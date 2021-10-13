/* 
 * Program to convert given column name in string to convert into integer value
 * @Muskan, 1910990681
 * Date: 12/10/2021
 * Weekly Challenge 3 Math
 */

public class Solution {
    public int titleToNumber(String A) {

        int i = 0;
        int j = 0;
	    int res = 0;

	    for (i = A.length() - 1, j = 0; i >= 0; i--) {
	        res += (int) Math.pow(26, j) * (A.charAt(i) - 'A' + 1);
	        j++;
	    }

	    return res;
    }
}

