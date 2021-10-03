public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        
        int size = A.size();
        int i = size - 1;
        int carry = 1; // starting with one
        int temp = 0;

        while(A.get(0) == 0 && i > 0 ){
            A.remove(0);
            i = A.size() - 1;
        }

        while(i >= 0){
            temp = A.get(i) + carry;
            A.set(i, temp % 10);
            carry = temp / 10;

            if(carry == 0){
                break;
            }

            i--;
        }

        if(carry != 0){
            A.add(0, carry);
        }

        return A;
    }
}

