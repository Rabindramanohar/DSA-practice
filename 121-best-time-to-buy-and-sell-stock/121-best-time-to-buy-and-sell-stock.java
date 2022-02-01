class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int ele : prices) {
            min = Math.min(min, ele);
            max = Math.max(max, ele-min);
        }
        return max;
    }
}