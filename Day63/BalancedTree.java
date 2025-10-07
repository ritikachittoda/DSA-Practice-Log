package Day63;

//LeetCode Problem 110: https://leetcode.com/problems/balanced-binary-tree/
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
   

public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null)  return  0;

        int lh = height(node.left);
        if(lh == -1) return -1;

        int rh = height(node.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) return -1; 

        return Math.max(lh, rh) + 1;
    }
}
