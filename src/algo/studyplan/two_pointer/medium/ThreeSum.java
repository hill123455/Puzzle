package studyplan.two_pointer.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {

    // https://leetcode.com/problems/3sum/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int currentValue = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currentSum = nums[left] + nums[right] + currentValue;
                if (currentSum == 0) {
                    result.add(new ArrayList<>(List.of(currentValue, nums[left], nums[right])));
                    left++;
                    right--;
                }
                if (currentSum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result.stream().collect(Collectors.toList());
    }
}
