class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int max=0, cnt=0;
        for(int i=0; i<nums.length; i++) {
            cnt=cnt+(nums[i] == 1 ? 1 : -1);
            if(hm.containsKey(cnt)) {
                max=Math.max(max, i-hm.get(cnt));
            } else
                hm.put(cnt, i);
        }
        return max;
    }
}