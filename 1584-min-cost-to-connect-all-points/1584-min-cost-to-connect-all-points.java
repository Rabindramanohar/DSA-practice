class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        // min-heap to store min-weight
        PriorityQueue<Pair<Integer, Integer>> heap = 
            new PriorityQueue<>((a, b) -> (a.getKey() - b.getKey()));
        // track node included in MST
        boolean[] inMST = new boolean[n];
        
        heap.add(new Pair(0, 0));
        int mstCost = 0;
        int edgesUsed = 0;
        
        while(edgesUsed < n) {
            Pair<Integer, Integer> topEle = heap.poll();
            int wt = topEle.getKey();
            int currNode = topEle.getValue();
            
            // node included in MST, discard edge
            if(inMST[currNode]) continue;
            
            inMST[currNode] = true;
            mstCost += wt;
            edgesUsed++;
            
            for(int nextNode=0; nextNode<n; nextNode++) {
                // nextNode not in MST then edge from curr node to next node can be pushed in priority queue.
                if(!inMST[nextNode]) {
                    int nextWeight = Math.abs(points[currNode][0] - points[nextNode][0]) +                                                Math.abs(points[currNode][1] - points[nextNode][1]);
                    heap.add(new Pair(nextWeight, nextNode));
                }
            }
        }
        return mstCost;
    }
}