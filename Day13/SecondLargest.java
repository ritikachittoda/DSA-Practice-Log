package Day13;

// GFG Problem: https://www.geeksforgeeks.org/problems/second-largest3735/1
// Time: O(n)​, Space: O(1)

public class SecondLargest {

    public int getSecondLargest(int[] arr) {
        int l1 = -1, l2 = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > l1){
                l2 = l1;
                l1 = arr[i];
            } else if(arr[i] < l1 && arr[i] > l2) { 
                l2 = arr[i];
            }
            
        }
        
        return l2;
    }
}
