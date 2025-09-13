package Day39;

import java.util.HashMap;

// LeetCode Problem: https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/
// Time: O(n), Space: O(1)

public class VowelConsonantMaxFreq {

    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxVowel = 0, maxCons = 0;

        for(char c : map.keySet()) {
            if("aeiou".indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, map.get(c));
            } else {
                maxCons = Math.max(maxCons, map.get(c));
            }
        }
        return maxVowel + maxCons;
    }
}