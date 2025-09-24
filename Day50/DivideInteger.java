package Day50;

//LeetCode Problem 29: https://leetcode.com/problems/divide-two-integers/
//Time: O(log n), Space: O(1)

public class DivideInteger {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        long result = 0;

        boolean negative = (dividend < 0) ^ (divisor < 0);
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        while (dividendL >= divisorL) {
            long temp = divisorL;
            long multiple = 1;

            while (dividendL >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dividendL -= temp;
            result += multiple;
        }

        result = negative ? -result : result;
        return (int) result;
    }
}
