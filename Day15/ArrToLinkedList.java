package Day15;

// GFG Problem: https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1
// Time: O(n)​, Space: O(n)

class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};

public class ArrToLinkedList {
    
    public Node arrayToList(int arr[]) {
        if(arr == null || arr.length == 0)  return null;
    
        Node head = new Node(arr[0]);
        Node tail = head;
        
        for(int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }
        
        return head;
        
    }
}
