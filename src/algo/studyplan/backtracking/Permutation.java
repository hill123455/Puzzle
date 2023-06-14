package studyplan.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    // https://leetcode.com/problems/permutations/

    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), nums, 0, new boolean[nums.length]);
        return result;
    }

    public void backTrack(List<List<Integer>> result, List<Integer> path, int[] nums, int index,
                          boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {continue;}
                path.add(nums[i]);
                used[i] = true;
                backTrack(result, path, nums, i + 1, used);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
