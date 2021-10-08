/*
 * A items are to be delivered in a circle of size B.
 * Find the position where the Ath item will be delivered if we start from a given position C.
 * Items are distributed at adjacent positions starting from C.
 *
 * @Muskan, 1910990681
 * Date: 08/10/2021
 * Weekly Challenge 2 Maths
 */

public class Solution {
    public int solve(int A, int B, int C) {
        return (A + (C - 1)) % B;
    }
}

