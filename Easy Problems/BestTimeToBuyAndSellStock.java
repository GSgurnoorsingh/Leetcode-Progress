class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(max>prices[i]){
                max=prices[i];
            }
            profit=Math.max(profit,prices[i]-max);
        }
        return profit;
    }
}
