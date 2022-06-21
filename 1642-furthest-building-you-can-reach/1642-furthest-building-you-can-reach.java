class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = heights.length;
        for(int i=1; i<n; i++) {
            int diff = heights[i]-heights[i-1];
            if(diff > 0) {
                if(pq.size() < ladders)
                    pq.offer(diff);
                else {
                    // replacing ladder with bricks
                    int br = diff;
                    if(pq.size() > 0 && pq.peek() < diff) {
                        br = pq.remove();
                        pq.offer(diff);
                    } 
                    if(bricks-br >= 0)
                        bricks = bricks-br;
                    else
                        return i-1;
                }
            }
        }
        return n-1;
    }
}