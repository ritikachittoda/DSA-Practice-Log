package Day02;

// LeetCode Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Time: O(n), Space: O(1)


public class BuySellStock1 {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            } else if(prices[i]-buy>profit){
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}
