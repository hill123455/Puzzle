package studyplan.two_pointer.medium;

public class TwoSum2 {

    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];
            if (total == target) {
                break;
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] { left, right };
    }
}
