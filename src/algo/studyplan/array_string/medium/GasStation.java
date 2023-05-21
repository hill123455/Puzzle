package studyplan.array_string.medium;

import java.util.Arrays;

public class GasStation {

    // https://leetcode.com/problems/gas-station/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

        int[] gas = { 2 };
        int[] cost = { 2 };
        System.out.println(canCompleteCircuit(gas, cost));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int[] roadMap = new int[gas.length];

        for (int i = 0; i < gas.length; i++) {
            roadMap[i] = gas[i] - cost[i];
        }

        if (Arrays.stream(roadMap).sum() < 0) {return -1;}
        int remain = 0;
        int start = 0;
        for (int i = 0; i < roadMap.length; start++) {
            remain += roadMap[i];
            if (remain < 0) {
                start = i + 1;
                remain = 0;
            }
        }
        return start;
    }
}
