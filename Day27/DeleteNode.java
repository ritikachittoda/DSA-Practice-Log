package Day27;

// LeetCode Problem: https://leetcode.com/problems/delete-node-in-a-linked-list/
// Time: O(1)​, Space: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next; 
    }
}
