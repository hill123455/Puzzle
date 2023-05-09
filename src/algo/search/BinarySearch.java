package search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 11, 15, 22, 67, 99, 110 };
        int target = 99;
        System.out.println(binarySearch(nums, target));
    }

    private static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            int pivot = (start + end) / 2;
            if (nums[pivot] == target) {return true;}
            if (nums[pivot] > target) {
                end = pivot - 1;
            } else {
                start = pivot + 1;
            }
        }
        return false;
    }
}
