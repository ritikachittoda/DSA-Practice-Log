package Day60;

//LeetCode Problem 11: https://leetcode.com/problems/container-with-most-water/
//Time: O(n), Space: O(1)

public class MaxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int lp= 0;
        int rp= height.length - 1;
       
        while (lp < rp) {
            int width = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int area = width * ht;
            maxArea = Math.max(maxArea, area);

            if(height[lp] < height[rp]) {
                lp++;
            } else  {
                rp--;
            }
        }

        return maxArea;
    }
}
