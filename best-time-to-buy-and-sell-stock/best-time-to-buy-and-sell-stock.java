class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = 0;
        for(int i=0; i<prices.length; i++) {
            if(minVal > prices[i]) 
                minVal = prices[i];
            else if(maxVal < prices[i]-minVal)
                maxVal = prices[i]-minVal;
        }
        return maxVal;
    }
}