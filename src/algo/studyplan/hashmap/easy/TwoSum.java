package studyplan.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // https://leetcode.com/problems/two-sum/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
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
