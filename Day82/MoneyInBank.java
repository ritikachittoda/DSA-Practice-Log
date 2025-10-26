package Day82;

//LeetCode Problem 1716: https://leetcode.com/problems/calculate-money-in-leetcode-bank/
//Time: O(n), Space: O(1)

public class MoneyInBank {
    public int totalMoney(int n) {
        int count = 0;
        int j = 1;
        int i = 1;
        int day = 1;

        while (day <= n) {
            count += i;
            if (day % 7 == 0) {
                j++;
                i = j;
            } else {
                i++;
            }
            day++;
        }
        
        return count;
    }
}
