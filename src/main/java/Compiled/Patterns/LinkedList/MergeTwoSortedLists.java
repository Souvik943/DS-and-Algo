package Compiled.Patterns.LinkedList;

// LeetCode : 21 : Merge Two Sorted Lists

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode();
        ListNode tempHead = newNode;

        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                newNode.next = list2;
                list2 = list2.next;
            } else {
                newNode.next = list1;
                list1 = list1.next;
            }
            newNode = newNode.next;
        }

        if(list1 == null) {
            newNode.next = list2;
        } else {
            newNode.next = list1;
        }

        return tempHead.next;
    }
}
