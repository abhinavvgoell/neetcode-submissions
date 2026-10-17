class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1, profit = 0, n = prices.length;

        while (j < n && i < n - 1) {
            if (prices[i] > prices[j]) {
                i = j;

            } else {
                if (prices[j] - prices[i] <= profit) {
                }
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
            j++;
        }
        return profit;
    }
}
