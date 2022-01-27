class Solution {
    public int findMaximumXOR(int[] nums) {
        int ans=0, mask=0;
        for(int i=31; i>=0; i--) {
            mask = mask | (1<<i);
            Set<Integer> hs = new HashSet<>();
            for(int num:nums)
                hs.add(num&mask);
            int tmp = ans | (1<<i);
            for(int ele : hs) {
                if(hs.contains(tmp^ele)){
                    ans = tmp;
                    break;
                }
            }
        }
        return ans;
    }
}