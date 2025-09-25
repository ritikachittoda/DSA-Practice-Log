package Day51;

//LeetCode Problem 860: https://leetcode.com/problems/lemonade-change/
//Time: O(n), Space: O(1) 

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for(int bill : bills) {
            if(bill == 5) {
                five++;
            } else if(bill == 10) {
                if(five == 0) return false;
                five--;
                ten++;
            } else {
                if(ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if(five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}