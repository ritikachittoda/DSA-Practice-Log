package Day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//LeetCode Problem 2273: https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/
//Time: O(n * k log k), Space: O(n * k)

public class RemoveAnagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans  = new ArrayList<>();
        String prev = "";

        for (String word : words) {
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String (ch);

            if (!sorted.equals(prev)) {
                ans.add(word);
                prev = sorted;
            }
        }
        return ans;
    }
}
