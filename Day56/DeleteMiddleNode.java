package Day56;

//LeetCode Problem 2095: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
//Time: O(n), Space: O(1) 

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = prev.next.next;
        return head;
    }
}
