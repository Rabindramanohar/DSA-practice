class Solution {
    public int missingNumber(int[] nums) {
        int xorArr=0;
        for(int ele : nums)
            xorArr ^= ele;
        int xorAll=0;
        for(int i=0; i<=nums.length; i++)
            xorAll ^= i;
        
        return xorAll^xorArr;
    }
}