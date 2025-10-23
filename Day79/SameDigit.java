package Day79;

//LeetCode Problem 3461: https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/
//Time: O(n²), Space: O(n)

public class SameDigit {
    public boolean hasSameDigits(String s) {
        while (s.length() != 2) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                temp.append((s.charAt(i) - '0' + s.charAt(i + 1) - '0') % 10);
            }
            s = temp.toString();
        }
        return s.charAt(0) == s.charAt(1); 
    }
}
