import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate2 {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
    public static void main(String[] args) {
        removeDuplicates(new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 });
    }

    public static int removeDuplicates(int[] nums) {
        int currentVal = nums[0];
        int shift = 0;
        int dup = 1;
        for (int i = 1; i < nums.length - shift; i++) {
            if (nums[i] == currentVal) {
                dup++;
                if (dup > 2) {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    i--;
                    dup--;
                    shift++;
                }
            } else {
                currentVal = nums[i];
                dup = 1;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, nums.length - shift);
        return nums.length;
    }

    public static int removeDuplicateSmart(int[] nums) {
        int dup = 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dup++;
            } else {
                dup = 0;
            }

            if (dup <= 1) {
                nums[index] = nums[i];
                index++;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, index);
        return nums.length;
    }

}

