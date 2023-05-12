package studyplan.array_string.easy;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count == nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
