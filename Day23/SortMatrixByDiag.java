package Day23;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// LeetCode Problem: https://leetcode.com/problems/sort-matrix-by-diagonals/
// Time: O(n^2 log n)​, Space: O(n^2)

public class SortMatrixByDiag {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, Deque<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
                int key = i - j;
                if(!map.containsKey(key)) {
                    map.put(key, new ArrayDeque<>());
                } 
                map.get(key).add(grid[i][j]);
            }
        }

        for(int key : map.keySet()) {
            List<Integer> list  = new ArrayList<>(map.get(key));
            if(key < 0) {
                Collections.sort(list);
            } else {
                Collections.sort(list, Collections.reverseOrder());
            }
            map.put(key, new ArrayDeque<>(list));
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int key = i - j;
                grid[i][j] = map.get(key).pollFirst();
            }
        }

        return grid;
    }
}
