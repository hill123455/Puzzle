package studyplan.array_string.medium;

public class RotateArray {

    //https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&id=top-interview-150

//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]
//    Explanation:
//    rotate 1 steps to the right: [7,1,2,3,4,5,6]
//    rotate 2 steps to the right: [6,7,1,2,3,4,5]
//    rotate 3 steps to the right: [5,6,7,1,2,3,4]

    public static void main(String[] args) {
        rotateO1(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[(i + k) % length] = nums[i];
        }
        nums = res;
    }

    public static void rotateO1(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
