class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int B[] = new int[n];
        int i=0, j=n-1;
        for(int p=n-1; p>=0; p--) {
            int val1 = nums[i]*nums[i];
            int val2 = nums[j]*nums[j];
            if(val1>val2) {
                B[p] = val1;
                i++;
            } else {
                B[p] = val2;
                j--;
            }
        }
        return B;
    }
}