class Solution {
    public int missingNumber(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for(int i=0; i<nums.length; i++) 
            cnt += nums[i];
        int total = n*(n+1)/2;
        return total-cnt;
    }
}