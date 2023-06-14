package studyplan.binary_search_tree.easy;

import studyplan.divide_conquer.TreeNode;

public class MinimumAbsoluteDifferenceInBST {

    // https://leetcode.com/problems/minimum-absolute-difference-in-bst/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    Integer prev;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {return min;}

        getMinimumDifference(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }

        prev = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}
