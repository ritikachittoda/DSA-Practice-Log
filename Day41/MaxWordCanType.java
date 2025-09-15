package Day41;

import java.util.HashSet;

// LeetCode Problem: https://leetcode.com/problems/maximum-number-of-words-you-can-type/
// Time: O(n + m), Space: O(n) where n is text length, m is brokenLetters length

public class MaxWordCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(char c : brokenLetters.toCharArray()) {
            set.add(c);
        }

        String[] words = text.split(" ");
        int count = 0;

        for(String word : words) {
            boolean canType = true;
            for(char c : word.toCharArray()) {
                if(set.contains(c)) {
                    canType = false;
                    break;
                }
            }

            if(canType) {
                count++;
            }
        }

        return count;
    }
}
