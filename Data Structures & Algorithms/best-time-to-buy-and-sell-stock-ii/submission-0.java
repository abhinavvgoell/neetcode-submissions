class Solution {
    public int maxProfit(int[] prices) {
        int curr=prices[0];
        int profit=0;

        for(int i =1; i<prices.length;i++){
            if(prices[i]<curr){
                curr = prices[i];
            }
            else if(prices[i]>curr){
                if(i+1<prices.length && prices[i+1]>prices[i]){
                    continue;
                }
                else if(i+1==prices.length){
                    profit = profit + prices[i] - curr;
                    return profit;

                }
                else{
                    profit = profit + prices[i] - curr;
                    curr =10000;
                }
            }
            else{
                continue;
            }
        }
        return profit;
    }
}