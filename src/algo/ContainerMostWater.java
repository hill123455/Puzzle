public class ContainerMostWater {

    public static void main(String[] args) {

    }

    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int leftVal = nums[left];
            int rightVal = nums[right];
            int area = Math.abs(leftVal - rightVal) * (right - left);
            max = Math.max(max, area);
            if (leftVal >= rightVal) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
