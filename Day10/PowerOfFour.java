package Day10;

// LeetCode Problem: https://leetcode.com/problems/power-of-four/
// Time: O(1), Space: O(1)

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;

        if((n&(n-1)) == 0 && Integer.bitCount(n-1)%2==0) return true;

        return false;
    }
}
