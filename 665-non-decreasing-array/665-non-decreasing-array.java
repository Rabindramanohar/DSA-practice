class Solution {
    public boolean checkPossibility(int[] nums) {
        int pos = -1, n=nums.length;
        for(int i=0; i<n-1; i++) {
            if(nums[i]>nums[i+1]){
                if(pos!=-1){
                    return false;
                }
                pos=i;
            }
        }
        return pos == -1 || pos == 0 || pos == n-2 || nums[pos-1] <= nums[pos+1] || nums[pos] <= nums[pos+2];
    }
}