class Solution {
    public int maxProfit(int[] prices) {
        int curr=prices[0];
        int profit=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<curr){
                curr=prices[i];
            }else{
                int currp=prices[i]-curr;
                profit=Math.max(profit,currp);
            }
        }

        return profit;
    }
}