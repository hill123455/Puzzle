package studyplan.binary_search_tree.medium;

import java.util.Stack;

import studyplan.divide_conquer.TreeNode;

public class KthSmallestElementBST {

    // https://leetcode.com/problems/kth-smallest-element-in-a-bst

    public static void main(String[] args) {

    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        int count = 0;

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                count++;
                if (count == k) {return cur.val;}
                cur = cur.right;
            }
        }
        return -1;
    }

    int count = 0;

    public int kthSmallest2(TreeNode root, int k) {
        if (root == null) {return -1;}
        int leftVal = kthSmallest(root.left, k);
        if (leftVal >= 0) {return leftVal;}
        count++;
        if(count == k) return root.val;
        return kthSmallest(root.right, k);
    }
}
