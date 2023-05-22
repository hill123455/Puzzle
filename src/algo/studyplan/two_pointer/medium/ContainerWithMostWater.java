package studyplan.two_pointer.medium;

public class ContainerWithMostWater {

    // https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int totalWater;
            if (height[left] <= height[right]) {
                totalWater = (right - left) * height[left];
                left++;
            } else {
                totalWater = (right - left) * height[right];
                right--;
            }
            max = Math.max(max, totalWater);
        }
        return max;
    }
}
