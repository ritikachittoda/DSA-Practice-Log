package Day45;

import java.util.HashSet;

//LeetCode Problem 3: https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Time: O(n), Space: O(n)

public class NonRepeatingSubStr {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int lp = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (set.contains(ch)) {
                set.remove(s.charAt(lp));
                lp++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, i - lp + 1);
        }

        return maxLen;
    }
}
