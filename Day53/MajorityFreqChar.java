package Day53;

import java.util.HashMap;

//LeetCode Problem 3692: https://leetcode.com/problems/majority-frequency-characters/
//Time: O(n), Space: O(n) 

public class MajorityFreqChar {
    public String majorityFrequencyGroup(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int f : freq) {
            if(f > 0) {
                map.put(f, map.getOrDefault(f, 0) + 1);
            }
        }

        int maxGroupSize = 0;
        int bestFreq = 0;
        
        for(int key : map.keySet()) {
            int groupSize = (map.get(key));
            if((groupSize > maxGroupSize) || (groupSize == maxGroupSize && key > bestFreq)) {
                maxGroupSize = groupSize;
                bestFreq = key;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(freq[i] == bestFreq) {
                sb.append((char)(i + 'a'));
            }
        }
        
        return sb.toString();
    }
}
