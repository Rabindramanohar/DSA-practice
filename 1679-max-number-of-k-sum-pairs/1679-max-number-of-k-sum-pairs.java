class Solution {
    // hashing T = 0(n), S=O(n)
    public int maxOperations(int[] nums, int k) {
        int cnt=0, n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++) {
            int left = k-nums[i];
            if(hm.containsKey(left) && hm.get(left) > 0) {
                cnt++;
                hm.put(left, hm.get(left)-1);
            } else
                hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        return cnt;
    }
}