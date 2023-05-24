package daily_challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class MaximumSubsequenceScore {

    // https://leetcode.com/problems/maximum-subsequence-score/

//    Input: nums1 = [1,3,3,2], nums2 = [2,1,3,4], k = 3
//    Output: 12
//    Explanation:
//    The four possible subsequence scores are
//    We choose the indices 0, 1, and 2 with score = (1+3+3) * min(2,1,3) = 7.
//    We choose the indices 0, 1, and 3 with score = (1+3+2) * min(2,1,4) = 6
//    Therefore, we return the max score, which is 12.

    public static void main(String[] args) {
        int[] nums1 = { 23, 16, 20, 7, 3 };
        int[] nums2 = { 19, 21, 22, 22, 12 };
        int k = 3;
        System.out.println(maxScore(nums1, nums2, k));
    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] { nums2[i], nums1[i] };
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.comparingInt(a -> a));
        long res = 0, totalSum = 0;
        for (int[] pair : pairs) {
            pq.add(pair[1]);
            totalSum += pair[1];
            if (pq.size() > k) {
                totalSum -= pq.poll();
            }
            if (pq.size() == k) {
                res = Math.max(res, totalSum * pair[0]);
            }
        }
        return res;
    }
}
