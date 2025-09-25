package Day51;

//LeetCode Problem 141: https://leetcode.com/problems/linked-list-cycle/
//Time: O(n), Space: O(1) 

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
