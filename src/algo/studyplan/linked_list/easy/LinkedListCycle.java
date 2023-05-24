package studyplan.linked_list.easy;

import studyplan.linked_list.easy.MergeTwoSortedLists.ListNode;

public class LinkedListCycle {

    // https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
