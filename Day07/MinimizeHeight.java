package Day07;

import java.util.Arrays;

// GFG Problem: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351
// Time: O(n log n), Space: O(1)

public class MinimizeHeight {

    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);  //Step 1 : Sort the array
        
        int diff = arr[n-1] - arr[0]; //Initial difference
        
        for(int i=0; i<n-1; i++){
            //Skip if negative
            if(arr[i+1] - k < 0) continue;
            
            //Step 2: Calculate smallest and tallest heights for this split
            int minHeight=Math.min(arr[0]+k, arr[i+1]-k);
            int maxHeight=Math.max(arr[i]+k, arr[n-1]-k);
            
            //Step 3: Update the smallest difference 
            diff=Math.min(diff,maxHeight - minHeight);
        }
        
        return diff;
    }

}