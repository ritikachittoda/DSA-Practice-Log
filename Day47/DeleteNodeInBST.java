package Day47;

//LeetCode Problem 450: https://leetcode.com/problems/delete-node-in-a-bst/
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

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if(root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if(root.right == null)  return root.left;
            if(root.left == null)  return root.right;

            TreeNode min = findMin(root.right);
            root.val = min.val;
            root.right = deleteNode(root.right, min.val);
        }

        return root;
        
    }

    private TreeNode findMin(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
}
