package Day28;

// LeetCode Problem: https://leetcode.com/problems/merge-similar-items/
// Time: O(n1 + n2 + k log k)​, Space: O(k)
// n1 = length of items1, n2 = length of items2, k = number of unique item values

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int pair[] : items1){
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }
        for(int pair[] : items2){
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int key : map.keySet()) {
            res.add(Arrays.asList(key, map.get(key)));
        }
        res.sort(Comparator.comparingInt(a -> a.get(0)));
        
        return res;
    }
}
