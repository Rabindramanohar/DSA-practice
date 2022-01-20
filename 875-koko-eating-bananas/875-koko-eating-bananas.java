class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 1;
        for(int pile:piles)
            high = Math.max(high, pile);
        
        while(low < high) {
            int middle = low + (high-low)/2;
            int k=0;
            for(int pile:piles) {
                k += Math.ceil((double)pile/middle);
            }
                if(k <= h)
                    high = middle;
                else
                    low = middle+1;
        }
        return high;
    }
}