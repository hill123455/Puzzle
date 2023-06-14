package studyplan.divide_conquer.medium;

import studyplan.divide_conquer.ListNode;

public class SortList {

    // https://leetcode.com/problems/sort-list/?envType=study-plan-v2&id=top-interview-150
    // Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?

    public static void main(String[] args) {
            SortList a = new SortList();
            ListNode node2 = new ListNode(4);
            ListNode node = new ListNode(3);
            node.next = node2;
            a.sortList(node);
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {return head;}

        // split list into half
        ListNode right = findMid(head);
        ListNode newRight = right.next;
        right.next = null;

        ListNode left = sortList(head);
        right = sortList(newRight);
        return merge(left, right);
    }

    public ListNode findMid(ListNode start) {
        ListNode slow = start;
        ListNode fast = start.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode mock = dummy;
        while (right != null && left != null) {
            if (right.val <= left.val) {
                dummy.next = right;
                right = right.next;
            } else {
                dummy.next = left;
                left = left.next;
            }
            dummy = dummy.next;
        }

        if (right != null) {
            dummy.next = right;
        } else if (left != null) {
            dummy.next = left;
        }
        return mock.next;
    }

}
