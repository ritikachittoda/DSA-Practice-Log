package Day63;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

//LeetCode Problem 1488: https://leetcode.com/problems/avoid-flood-in-the-city/
//Time: O(n log n), Space: O(n)

public class AvoidFlood {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        HashMap<Integer, Integer> full = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < rains.length; i++) {
            int lake = rains[i];
            if (lake > 0) {
                ans[i] = -1;
                if (full.containsKey(lake)) {
                    int lastRain = full.get(lake);
                    Integer dryDay = dryDays.higher(lastRain);
                    if(dryDay == null) return new int[0];
                    ans[dryDay] = lake;
                    dryDays.remove(dryDay); 
                }
                full.put(lake, i);
            } else {
                dryDays.add(i);
            }
        }

        return ans;
    }
}
