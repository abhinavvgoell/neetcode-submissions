class Solution {
    public int maxProfit(int[] prices) {
        int i = 1;
        int n = prices.length;
        int j = n - 1;
        int curr = prices[0];
        int currind = 0;
        int maxsell = 0;
        int maxsellind = 0;
        int profit = 0;

        while (i < n) {
            if (prices[i] < curr) {
                curr = prices[i];
                currind = i;
                i++;

                continue; //  7 6 4 3 1
            } else if (prices[i] > curr && i < n - 1) {
                if (prices[i + 1] >= prices[i] && i < n - 1) {
                    i++;
                    continue;
                } else if (prices[i + 1] < prices[i] && i < n - 1 && i >= currind) {
                    if (profit <= prices[i]-curr) {
                        maxsell = prices[i];
                        maxsellind = i;
                        profit = maxsell - curr;
                    }
                }

            } else if (prices[i] == curr) {
                i++;
                continue;
            } else {
                if (profit <= prices[i]-curr && i >= currind) {
                    maxsell = prices[i];
                    maxsellind = i;
                    profit = maxsell - curr;
                }
            }
            i++;
        }

        if (profit >= 0) {
            return profit;
        } else {
            return 0;
        }
    }
}
