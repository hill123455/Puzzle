package studyplan.sliding_window.medium;

public class MiniumSizeSubArraySum {

    // https://leetcode.com/problems/minimum-size-subarray-sum/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int currentSum = 0;

        while (right < nums.length) {
            currentSum += nums[right];
            if (currentSum >= target) {
                minLength = Math.min(minLength, right - left);
                currentSum -= nums[left];
                currentSum -= nums[right];
                left++;
            } else {
                right++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
