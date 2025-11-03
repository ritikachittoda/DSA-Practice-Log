package Day90;

//LeetCode Problem 1578: https://leetcode.com/problems/minimum-time-to-make-rope-colorful/
//Time: O(n), Space: O(1)

public class MakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        int minTime = 0;
        int n = colors.length();

        int i = 0;
        while (i < n) {
            int color = colors.charAt(i);
            int maxTime = 0, sumTime = 0;

            while (i < n && color == colors.charAt(i)) {
                sumTime += neededTime[i];
                maxTime = Math.max(maxTime, neededTime[i]); 
                i++;
            }

            minTime += sumTime - maxTime;
        }

        return minTime;
    }
}