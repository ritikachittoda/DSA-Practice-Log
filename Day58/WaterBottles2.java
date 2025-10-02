package Day58;

//LeetCode Problem 3100: https://leetcode.com/problems/water-bottles-ii/
//Time: O(n), Space: O(1) 

public class WaterBottles2 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottlesDrunk = numBottles;
        int emptyBottles = numBottles;

        while(emptyBottles >= numExchange) {
            emptyBottles -=  numExchange;
            numExchange++;
            bottlesDrunk ++;
            emptyBottles++;
        }
        
        return bottlesDrunk;
    }
}
