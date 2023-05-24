package studyplan.linked_list.easy;

public class MergeTwoSortedLists {

    // https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result= new ListNode(-1);
        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                result.next =list1;
                list1 = list1.next;
            }else {
                result.next = list2;
                list2=list2.next;
            }
            result = result.next;
        }
        return result.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {this.val = val;}

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
