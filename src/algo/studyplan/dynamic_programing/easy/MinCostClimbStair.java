package studyplan.dynamic_programing.easy;

public class MinCostClimbStair {

    //https://leetcode.com/problems/min-cost-climbing-stairs/

//    Input: cost = [1,100,1,1,1,100,1,1,100,1]
//    Output: 6
//    Explanation: You will start at index 0.
//            - Pay 1 and climb two steps to reach index 2.
//            - Pay 1 and climb two steps to reach index 4.
//            - Pay 1 and climb two steps to reach index 6.
//            - Pay 1 and climb one step to reach index 7.
//            - Pay 1 and climb two steps to reach index 9.
//            - Pay 1 and climb one step to reach the top.
//    The total cost is 6.

    public static void main(String[] args) {

    }

    public int minCostClimbingStairs(int[] cost) {
        int f1 = cost[0];
        int f2 = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int currentCost = cost[i] + Math.min(f1, f2);
            f1 = f2;
            f2 = currentCost;
        }
        return Math.min(f1, f2);
    }
}
