class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> hm = new HashMap();
        for (int n: nums) {
          hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> q = new PriorityQueue<>(
            (n1, n2) -> hm.get(n1) - hm.get(n2));
        for (int n: hm.keySet()) {
          q.add(n);
          if (q.size() > k) q.poll();    
        }
        
        int[] ans = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            ans[i] = q.poll();
        }
        return ans;
    }
}