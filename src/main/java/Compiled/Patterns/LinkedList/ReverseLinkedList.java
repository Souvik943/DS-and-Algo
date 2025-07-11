package Compiled.Patterns.LinkedList;

//LeetCode : 206 : Reverse Linked List

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode prevNode = null;
        ListNode currNode = head;

        while(currNode != null) {
            ListNode newNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = newNode;
        }

        head = prevNode;

        return head;
    }

    class ListNode {
        int val;
        ListNode next;
    }
}
