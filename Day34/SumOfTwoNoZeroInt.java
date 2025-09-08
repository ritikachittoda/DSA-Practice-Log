package Day34;

// LeetCode Problem: https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
// Time: O(n)​, Space: O(1)

public class SumOfTwoNoZeroInt {
    public int[] getNoZeroIntegers(int n) {
        for(int a = 1; a < n; a++) {
            int b = n - a;
            if(noZero(a) && noZero(b)) {
                return new int []{a, b};
            }
        }

        return new int []{};
    }

    private boolean noZero (int num) {
        while(num > 0) {
            if(num % 10 == 0) return false;
            num /= 10;
        } 
        return true ;
    }
}
