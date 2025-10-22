package Day78;

//LeetCode Problem 24: https://leetcode.com/problems/swap-nodes-in-pairs/
//Time: O(n), Space: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while(temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            temp.next = second;

            temp = first;
        }

        return dummy.next;
    }
}
