package Day37;

import java.util.ArrayList;
import java.util.Collections;

// LeetCode Problem: https://leetcode.com/problems/sort-vowels-in-a-string/
// Time: O(N log N)​, Space: O(N)

public class SortVowels {
    public String sortVowels(String s) {
        ArrayList<Character> vowel = new ArrayList<>();

        for(char ch : s.toCharArray()) {
            if("aeiouAEIOU".indexOf(ch) != -1) {
                vowel.add(ch);
            } 
        }

        Collections.sort(vowel);

        StringBuilder result = new StringBuilder();
        int idx = 0;

        for(char ch : s.toCharArray()) {
            if("aeiouAEIOU".indexOf(ch) != -1) {
                result.append(vowel.get(idx++));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
