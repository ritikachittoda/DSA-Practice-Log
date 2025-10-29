package Day85;

//LeetCode Problem 3370: https://leetcode.com/problems/smallest-number-with-all-set-bits/
//Time: O(1), Space: O(1)

public class AllSetBits {
    public int smallestNumber(int n) {
        for (int i = 1; i < 31; i++) {
            if ((1 << i) - 1 >= n) {
                return (1 << i) - 1; 
            }
        }
        return  -1;
    }
}