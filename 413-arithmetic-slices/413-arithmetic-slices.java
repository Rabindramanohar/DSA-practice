class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length <= 2) return 0;
        int ans = 0;
        int[] count = new int[nums.length];
        
        for(int i=2; i<nums.length; i++) {
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
                count[i] = count[i-1]+1;
            ans += count[i];
        }
        return ans;
    }
}