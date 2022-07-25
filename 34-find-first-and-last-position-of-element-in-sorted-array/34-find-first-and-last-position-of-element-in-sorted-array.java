class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        if(nums.length == 0) return ans;
        int start = 0, end = nums.length-1;
        
        while(start < end) {
            int mid = start + (end - start)/2;
            if(nums[mid] >= target)
                end = mid;
            else
                start = mid+1;
        }
        
        if(nums[start] != target)
            return ans;
        
        ans[0] = start;
        end = nums.length;
        
        while(start < end) {
            int mid = start + (end - start)/2;
            if(nums[mid] > target)
                end = mid;
            else
                start = mid+1;
        }
        ans[1] = start-1;
        
        return ans;
    }
}