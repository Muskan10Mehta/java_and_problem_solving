/*
 * You are given an integer N and the task is to reverse the digits of the given integer. 
 * Return 0 if the result overflows and does not fit in a 32 bit signed integer
 * @Muskan, 1910990681
 * Date: 11/10/2021
 * Weekly challenge 3 math
 */

public class Solution {
    public int reverse(int A) {

        int temp = A;
        int len = 0;
        int rev = 0;
        int sign = 1;

        if(A < 0){
            A = -A;
            sign = -1;
        }


        while(temp != 0){
            temp = temp / 10;
            len++;
        }

        temp = A;
        while(len != 0){

            if (rev > Integer.MAX_VALUE / 10 || ((rev == Integer.MAX_VALUE / 10) && temp % 10 > Integer.MAX_VALUE % 10)) {
				return 0;
			}
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
            len--;
        }

       rev = rev * sign;
       return rev;
    }
}
