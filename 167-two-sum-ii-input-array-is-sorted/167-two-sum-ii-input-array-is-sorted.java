class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) return new int[2];
        int l=0, h=nums.length-1;
        while(l<h) {
            if(nums[l]+nums[h] == target)
                return new int[]{l+1, h+1};
            else if(nums[l]+nums[h] < target)
                l++;
            else
                h--;
        }
        return new int[2];
    }
}