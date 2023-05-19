package studyplan.array_string.medium;

public class JumpGame2 {

    //https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        int[] in = { 2, 3, 1, 1, 4, 6, 1, 1, 1, 2, 3, 5 };
        System.out.println(jump(in));
    }

    public static int jump(int[] nums) {
        int jump = 0;
        int currentMaxPos = 0;
        int currentEnd = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentMaxPos = Math.max(currentMaxPos, i + nums[i]);

            if (currentMaxPos == nums.length - 1) {
                jump++;
                break;
            }

            if (i == currentEnd) {
                jump++;
                currentEnd = currentMaxPos;
            }
        }
        return jump;
    }
}
