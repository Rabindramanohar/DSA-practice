class KthLargest {
    private int k;
    private PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>();
        for(int ele : nums) 
            q.offer(ele);
        while(q.size() > k)
            q.poll();
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size() > k)
            q.poll();
        
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */