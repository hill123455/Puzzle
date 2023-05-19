package studyplan.array_string.medium;

public class JumpGame {

    // https://leetcode.com/problems/jump-game/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
//        Input: nums = [3,2,1,0,4]
//        Output: false
    }

    public static boolean canJump(int[] nums) {
        int pointer = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= (pointer - i)) {
                pointer = i;
            }
        }
        return pointer == 0;
    }
}
