package Day60;

//LeetCode Problem 2929: https://leetcode.com/problems/distribute-candies-among-children-ii/
//Time: O(n), Space: O(1)

public class DistributeCandiesII {
    public long distributeCandies(int n, int limit) {
        long count = 0;

        for(int i = 0 ; i <= Math.min(n, limit); i++) {
            if (n - i > 2 * limit) {
                continue;
            }
            count += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
        }

        return count;
    }
}
