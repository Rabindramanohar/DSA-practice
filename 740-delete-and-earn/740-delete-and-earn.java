class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for(int ele : nums) 
            values[ele] += ele;
        int take=0, skip=0;
        for(int i=0; i<n; i++) {
            int takei = skip+values[i];
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }
}