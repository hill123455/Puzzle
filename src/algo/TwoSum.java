import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        for (int num : twoSum(nums, target)) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
