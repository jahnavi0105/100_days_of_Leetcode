class Solution {
    public int maxProfit(int[] prices) {
        int min=10000000,max=-100000000;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
                min=prices[i];
            max=Math.max(prices[i]-min,max);
        }
        return max;
    }
}
