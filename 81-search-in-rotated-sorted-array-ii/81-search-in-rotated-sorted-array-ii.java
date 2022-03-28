class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, h = nums.length-1;
        while(l <= h) {
            int mid = (l+h)/2;
            if(nums[mid] == target)
                return true;
            if(nums[mid] < target)
                l = mid+1;
            else
                h = mid-1;
        }
        return false;
    }
}