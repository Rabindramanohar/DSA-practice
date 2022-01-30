class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2, count = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
                if(count >= n)
                    return nums[i-1];
            } else
                count = 0;
        }
        return nums.length <= 2 ? nums[0] : -1;
    }
}