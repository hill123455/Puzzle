package studyplan.hashmap.easy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ContainDuplicate {

    // https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] { 1,2,3,1,2,3 }, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
            if (set.size() == k + 1) {
                set.remove(set.iterator().next());
            }
        }
        return false;
    }
}
