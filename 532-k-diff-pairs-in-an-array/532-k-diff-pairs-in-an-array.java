class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int n = nums.length, cnt = 0;
        
        for(int ele : nums) 
            hm.put(ele, hm.getOrDefault(ele, 0)+1);
        
        for(int ele : hm.keySet())
            if(k>0 && hm.containsKey(k+ele) || k==0 && hm.get(ele)>1)
                cnt++;
        
        return cnt;
    }
}