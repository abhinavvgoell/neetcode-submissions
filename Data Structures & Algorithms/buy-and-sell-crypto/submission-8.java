class Solution {
    public int maxProfit(int[] prices) {
        int curr=prices[0];
        int profit = 0;
        int j =1;

        for(int i =0; i < prices.length;i++){
           if(curr>prices[i]){
            curr = prices[i];
           }
           if(prices[i]-curr>profit){
            profit = prices[i]-curr;
           }
        }
        return profit;
    }
}
