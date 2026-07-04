class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int left=0;
        int right=0;
        
        while(right<prices.length-1){
            right++;

            int currProfit=prices[right]-prices[left];
            if(currProfit<0){
                left=right;
            }
            maxProfit=Math.max(maxProfit,currProfit);
        }
        return maxProfit;
    }
}
