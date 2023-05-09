public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode meetingPoint = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                meetingPoint = slow;
                break;
            }
        }

        if (meetingPoint == null) {return null;}

        slow = head;
        while (slow != meetingPoint) {
            slow = slow.next;
            meetingPoint = meetingPoint.next;
        }

        return slow;
    }

}
