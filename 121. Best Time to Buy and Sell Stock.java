class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
       int buy=0,sell=1;
       while(sell<n)
       {
           if(prices[buy]>prices[sell])
           {
               buy++;
               sell=buy;
           }
           profit=Math.max(profit,prices[sell]-prices[buy]);
           sell++;
       }
       return profit;
    }
}
