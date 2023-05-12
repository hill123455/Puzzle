public class RotateArray {

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5 };
        int k = 2;
        rotate(nums, k);

    }

    public static void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[(i + k) % (nums.length)] = nums[i];
        }

    }
}
