package Day48;

//LeetCode Problem 701: https://leetcode.com/problems/insert-into-a-binary-search-tree/
//Time: O(h), Space: O(h)

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

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)  return new TreeNode(val);

        if(root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else if(root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }    
}