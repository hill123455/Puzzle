package studyplan;

import java.util.Arrays;

public class RemoveDuplicate {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array

    public static void main(String[] args) {
//        System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
//        System.out.println(removeDuplicates(new int[] { 1, 1 }));
        System.out.println(removeDuplicates2(new int[] { 1, 1, 2 }));
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int shiftTimes = 0;
        for (int i = 1; i < length - shiftTimes; i++) {
            if (nums[i] == nums[i - 1]) {
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                shiftTimes++;
                i--;
            }
        }

        nums = Arrays.copyOf(nums, length - shiftTimes);
        return nums.length;
    }

    public static int removeDuplicates2(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
