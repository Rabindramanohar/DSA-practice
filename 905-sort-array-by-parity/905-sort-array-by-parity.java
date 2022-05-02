class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int t = 0, n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
            if(nums[i]%2 == 0)
                ans[t++] = nums[i];
        for(int i=0; i<n; i++)
            if(nums[i]%2 != 0)
                ans[t++] = nums[i];
        return ans;
    }
}