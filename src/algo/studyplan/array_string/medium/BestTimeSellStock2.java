package studyplan.array_string.medium;

public class BestTimeSellStock2 {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&id=top-interview-150

//    Input: prices = [7,1,5,3,6,4]
//    Output: 7
//    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//    Total profit is 4 + 3 = 7.

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    public static int maxProfit(int[] prices) {
        int total = 0;
        int totalMaxProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[right] - prices[left] < totalMaxProfit) {
                total += totalMaxProfit;
                totalMaxProfit = 0;
                left = right;
            } else {
                totalMaxProfit = prices[right] - prices[left];
            }
            right++;
        }
        return total + totalMaxProfit;
    }
}
