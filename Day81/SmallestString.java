package Day81;

//LeetCode Problem 3722: https://leetcode.com/problems/lexicographically-smallest-string-after-reverse/
//Time: O(n²), Space: O(n)

public class SmallestString {
    public String lexSmallest(String s) {
        int n = s.length();
        String ans = s;

        for (int i = 1; i <= n; i++) {
            String prefix = new StringBuilder(s.substring(0, i)).reverse().toString() + s.substring(i);
            if (prefix.compareTo(ans) < 0)
                ans = prefix;

            String suffix = s.substring(0, n - i) + new StringBuilder(s.substring(n - i)).reverse().toString();
            if (suffix.compareTo(ans) < 0)
                ans = suffix;
        }

        return ans;
    }
}
