class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int num : nums)
            hs.add(num);
        int cnt = 0;
        for(int num : nums) {
            if(!hs.contains(num-1)) {
                int curr = num;
                int currStreak = 1;
                
                while(hs.contains(curr+1)) {
                    curr += 1;
                    currStreak += 1;
                }
                
                cnt = Math.max(cnt, currStreak);
            }
        }
        return cnt;
    }
}