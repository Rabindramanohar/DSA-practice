class Solution {
    public void moveZeroes(int[] nums) {
        int lastDigit = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0)
                nums[lastDigit++] = nums[i];
        }
        for(int i=lastDigit; i<nums.length; i++)
            nums[i] = 0;
    }
}