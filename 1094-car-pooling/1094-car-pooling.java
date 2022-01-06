class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // find the largest value of locations
        int lastLocation = Integer.MIN_VALUE;
        for(int[] trip : trips) {
            lastLocation = Math.max(lastLocation, trip[2]);
        }
        // create arr of locations of largest value
        int[] locations = new int[lastLocation + 1];
        // Manipulate locations arr a/c to pick up and drop locations
        for(int[] trip : trips) {
            if(trip[0] > capacity) return false;
            locations[trip[1]] += trip[0];
            locations[trip[2]] -= trip[0];
        }
        // Do prefix sum to check the num of passenger should not exceed the capacity
        for(int i=1; i<=lastLocation; i++) {
            locations[i] += locations[i-1];
            if(locations[i] > capacity)
                return false;
        }
        return true;
    }
}