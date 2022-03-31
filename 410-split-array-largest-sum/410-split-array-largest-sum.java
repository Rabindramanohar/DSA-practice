class Solution {
    // binary search T=O(nlogs), S=O(1);
    public int splitArray(int[] nums, int m) {
        int sum = 0;
        int maxEle = (int)(-1e9);
        for(int ele : nums) {
            sum += ele;
            maxEle = Math.max(maxEle, ele);
        }
        int l = maxEle, h = sum;
        int ans = 0;
        while(l <= h) {
            int mid = l+(h-l)/2;
            if(reqSubarrays(nums, mid) <= m) {
                h = mid-1;
                ans = mid;
            } else
                l = mid+1;
        }
        return ans;
    }
    
    private int reqSubarrays(int[] nums, int mid) {
        int curr = 0, split = 0;
        for(int ele : nums) {
            if(curr + ele <= mid)
                curr += ele;
            else {
                curr = ele;
                split++;
            }
        }
        return split + 1;
    }
}