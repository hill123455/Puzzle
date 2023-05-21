package studyplan.array_string.medium;

public class ProductOfArrayExceptSelf {

//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]

//    1,1,2,6
//    24,12,4,1
    //https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        res[0] = 1;

        for (int i = 1; i < length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int currentPostFix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= currentPostFix;
            currentPostFix *= nums[i];
        }

        return res;
    }
}
