class Solution {
    public boolean search(int[] nums, int k) {
        int l = 0, h = nums.length-1;
        while(l <= h) {
            int mid = l + (h-l)/2;
            if(nums[mid] == k)
                return true;
            // when 1st half is sorted
            if(nums[l] < nums[mid]) {
                if(k < nums[l] || k > nums[mid])
                    l = mid+1;
                else
                    h = mid-1;
            } else if(nums[l] > nums[mid]) { // means search part lies in the range of both the sorted parts
                if(k < nums[mid] || k > nums[h])
                    h = mid-1;
                else 
                    l = mid+1;
            } else
                l++;
        }
        return false;
    }
}