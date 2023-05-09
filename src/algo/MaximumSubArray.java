public class MaximumSubArray {

    public static void main(String[] args) {
        System.out.println(subArray2(new int[] { -2, 3, -5, 2, 2, -1, 4, -3 }));
    }

    // Brute force with O(n^2)
    public static int subArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Kadane O(n)
    public static int subArray2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxLocalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            maxLocalSum = Math.max(nums[i], maxLocalSum + nums[i]);
            maxSum= Math.max(maxLocalSum, maxSum);
        }
        return maxSum;
    }
}
