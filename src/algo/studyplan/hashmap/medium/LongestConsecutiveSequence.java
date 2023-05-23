package studyplan.hashmap.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

    // https://leetcode.com/problems/longest-consecutive-sequence/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        System.out.println(longestConsecutive2(new int[] { 100, 4, 200, 1, 3, 2 }));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 0;
                int currentNum = num;
                while (set.contains(currentNum)) {
                    count++;
                    currentNum++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static int longestConsecutive2(int[] nums) {
        if (nums.length == 0) {return 0;}
        Arrays.sort(nums);
        int max = 0;
        int curr = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i-1] == 1) curr++;
            else if(nums[i] == nums[i-1]) continue;
            else {
                max = Math.max(max, curr);
                curr = 1;
            }
        }

        max = Math.max(max, curr);
        return max;
    }
}
