package Day57;

//LeetCode Problem 1518: https://leetcode.com/problems/water-bottles/
//Time: O(1), Space: O(1) 

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}