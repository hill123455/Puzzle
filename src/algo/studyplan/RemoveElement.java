package studyplan;

import java.util.Arrays;

public class RemoveElement {

    // https://leetcode.com/problems/remove-element

    public static void main(String[] args) {
        removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);
    }

    public static int removeElement(int[] nums, int val) {
        int resize = 0;
        for (int i = 0; i < nums.length - resize; i++) {
            if (nums[i] == val) {
                resize++;
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
            }
        }
        nums = Arrays.copyOf(nums, nums.length - resize);
        return nums.length;
    }
}
