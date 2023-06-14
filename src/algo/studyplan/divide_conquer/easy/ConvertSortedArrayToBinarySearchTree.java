package studyplan.divide_conquer.easy;

import java.util.Arrays;

import studyplan.divide_conquer.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        TreeNode res = sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length <= 0) {return null;}
        if (nums.length == 1) {return new TreeNode(nums[0]);}
        int mid = nums.length / 2;
        TreeNode left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        TreeNode right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return new TreeNode(nums[mid], left, right);
    }
}
