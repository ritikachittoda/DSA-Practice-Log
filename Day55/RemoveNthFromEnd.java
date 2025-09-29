package Day55;

//LeetCode Problem 19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//Time: O(n), Space: O(1) 

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int sz = 0;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) return head.next;

        int i = 1;
        int iTofind = sz - n;
        ListNode prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;   
    }
}
