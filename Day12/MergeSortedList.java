package Day12;

// LeetCode Problem: https://leetcode.com/problems/merge-two-sorted-lists/
// Time: O(m+n), Space: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode list3 = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                list3.next = list1;
                list1 = list1.next;
                list3 = list3.next;
            }else{
                list3.next = list2;
                list2 = list2.next;
                list3 = list3.next;
            }
        }
        while(list1 != null){
            list3.next = list1;
            list1 = list1.next;
            list3 = list3.next;
        }
        while(list2 != null){
            list3.next = list2;
            list2 = list2.next;
            list3 = list3.next;
        }
        return dummy.next;
    }
}