package Day57;

import java.util.HashMap;
import java.util.Stack;

//LeetCode Problem 496: https://leetcode.com/problems/next-greater-element-i/
//Time: O(n+m), Space: O(m) 

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans[] = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = m - 1; i >= 0; i--) {
            int num = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        } 

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums1[i]);
        }
        
        return ans;
    }
}
