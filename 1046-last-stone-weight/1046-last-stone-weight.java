class Solution {
    public int lastStoneWeight(int[] stones) {
        // using Priority Queue
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> (b-a));
        for(int ele : stones)
            q.add(ele);
        while(q.size() > 1) {
            int x = q.poll();
            int y = q.poll();
            q.add(x-y);
        }
        return q.poll();
    }
}

