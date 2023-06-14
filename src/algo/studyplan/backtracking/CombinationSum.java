package studyplan.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    //https://leetcode.com/problems/combination-sum/

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), target, candidates, 0);
        return result;
    }

    public void backTrack(List<List<Integer>> result, List<Integer> path, int target, int[] candidates,
                          int index) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
        } else if (target > 0) {
            for (int i = index; i < candidates.length; i++) {
                path.add(candidates[i]);
                backTrack(result, path, target - candidates[i], candidates, i);
                path.remove(path.size() - 1);
            }
        }
    }
}
