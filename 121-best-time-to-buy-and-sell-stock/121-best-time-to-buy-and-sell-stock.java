class Solution {
    public int maxProfit(int[] prices) {
        int maxCur=0, max=0;
        
        for(int i=1; i<prices.length; i++) {
            int curr = maxCur + prices[i]-prices[i-1];
            maxCur = Math.max(0, curr);
            max = Math.max(max, maxCur);
        }
        return max;
    }
}