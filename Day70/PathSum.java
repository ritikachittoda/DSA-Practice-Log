package Day70;

//LeetCode Problem 124: https://leetcode.com/problems/binary-tree-maximum-path-sum/
//Time: O(n), Space: O(h)

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PathSum {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sum(root);
        return maxSum;
    }

    private int sum(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, sum(node.left));
        int right = Math.max(0, sum(node.right));

        maxSum = Math.max(maxSum, left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}