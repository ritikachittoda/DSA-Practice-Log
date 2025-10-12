package Day68;

//LeetCode Problem 61: https://leetcode.com/problems/rotate-list/
//Time: O(n), Space: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }
        temp.next = head;

        k = k % n;
        int steps = n - k;

        while (steps-- > 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;

    }
}
