package studyplan.dynamic_programing.easy;

public class ClimbStair {

    // https://leetcode.com/problems/climbing-stairs/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {return n;}
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (i == n - 1) {
                return arr[i];
            }
        }
        return 0;
    }
}
