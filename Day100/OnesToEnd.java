package Day100;

//LeetCode Problem 3228: https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/
//Time: O(n), Space: O(1) 

public class OnesToEnd {
    public int maxOperations(String s) {
        int ones = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ones++;
            else if (i > 0 && s.charAt(i - 1) == '1')
                res += ones;
        }
        return res;
    }    
}