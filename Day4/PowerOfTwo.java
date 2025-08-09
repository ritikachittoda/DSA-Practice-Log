package Day4;

// LeetCode Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time: O(log n), Space: O(1)

class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if (n == 1) {
            return true;
        }
        while(n>=2){
            if(n%2!=0){
                return false;
            }
            n/=2;
        }
        return true;
    }
}