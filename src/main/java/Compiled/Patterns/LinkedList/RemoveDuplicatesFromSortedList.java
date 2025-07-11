package Compiled.Patterns.LinkedList;

// LeetCode : 83 : Remove Duplicates from Sorted List

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        while(currNode != null && currNode.next != null) {
            if(currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
    }
}
