package Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// GFG Problem: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
// Time: O((m+n) log(m+n))​, Space: O(m+n)

public class Union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num: a) {
            set.add(num);
        }
        
        for(int num: b) {
            set.add(num);
        }
        
        ArrayList<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        
        return ans;
        
    }
}
