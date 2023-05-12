package studyplan.array_string.easy;

public class BestTimeBuySellStock {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock

    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if (prices[left] >= prices[right]) {
                left = right;
            } else {
                max = Math.max(max, prices[right] - prices[left]);
            }
            right++;
        }
        return max;
    }
}
