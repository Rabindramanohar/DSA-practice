class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        if(n == 1) return 0;
        int endingMask = (1<<n)-1;
        boolean[][] seen = new boolean[n][endingMask];
        int steps = 0;
        ArrayList<int[]> q = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            q.add(new int[]{i, 1<<i});
            seen[i][1<<i] = true;
        }
        
        while(!q.isEmpty()) {
            ArrayList<int[]> nextQ = new ArrayList<>();
            for(int i=0; i<q.size(); i++) {
                int[] currPair = q.get(i);
                int node = currPair[0];
                int mask = currPair[1];
                for(int ng : graph[node]) {
                    int nextMask = mask | (1<<ng);
                    if(nextMask == endingMask)
                        return 1+steps;
                    if(!seen[ng][nextMask]) {
                        seen[ng][nextMask] = true;
                        nextQ.add(new int[]{ng, nextMask});
                    }
                }
            }
            steps++;
            q = nextQ;
        }
        return -1;
    }
}