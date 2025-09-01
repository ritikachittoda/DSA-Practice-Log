package Day27;

// LeetCode Problem: https://leetcode.com/problems/count-good-numbers/
// Time: O(log n)​, Space: O(1)

public class CountGoodNumber {
    static final int MOD=1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = n - odd;
        long evenpow = modPow(5, even, MOD);
        long oddpow = modPow(4, odd, MOD);
        return (int)((evenpow * oddpow) % MOD);
    }
    
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
