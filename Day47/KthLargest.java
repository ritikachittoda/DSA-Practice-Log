package Day47;

import java.util.PriorityQueue;

//LeetCode Problem 215: https://leetcode.com/problems/kth-largest-element-in-an-array/
//Time: O(n log k), Space: O(k)

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums) {
            pq.add(num);
            if(pq.size() > k) {
                pq.remove();
            }
        }

        return pq.peek();
    }
}