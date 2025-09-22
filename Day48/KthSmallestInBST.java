package Day48;

//LeetCode Problem 230: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
//Time: O(h + k), Space: O(h)

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

public class KthSmallestInBST {
    int count = 0, result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    public void inorder(TreeNode root, int k) {
        if(root == null) {
            return;
        }

        inorder(root.left, k);
        count++;
        if(count == k) {
            result = root.val;
            return;
        }
        inorder(root.right, k);

    }
}
