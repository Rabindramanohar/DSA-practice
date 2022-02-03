class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int cnt = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int e1 : nums1) {
            for(int e2 : nums2) {
                hm.put(e1+e2, hm.getOrDefault(e1+e2, 0)+1);
            }
        }
        for(int e1 : nums3) {
            for(int e2 : nums4) {
                cnt += hm.getOrDefault((0-(e1+e2)), 0);
            }
        }
        return cnt;
    }
}