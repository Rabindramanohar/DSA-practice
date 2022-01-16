class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIdx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) 
                zeroIdx++;
            else if(zeroIdx > 0) {
                int tmp = nums[i];
                nums[i] = 0;
                nums[i-zeroIdx] = tmp;
            }
        }
    }
}