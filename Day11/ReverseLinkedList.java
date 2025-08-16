package Day11;

// LeetCode Problem: https://leetcode.com/problems/reverse-linked-list/
// Time: O(n), Space: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null  || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

        
    }
}