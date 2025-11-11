package Day98;

import java.util.HashMap;

//LeetCode Problem 409: https://leetcode.com/problems/longest-palindrome/
//Time: O(n), Space: O(k) where k = number of distinct characters in s

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;
        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                hasOdd = true;
            }
        }

        return hasOdd ? count + 1 : count;
    }
}