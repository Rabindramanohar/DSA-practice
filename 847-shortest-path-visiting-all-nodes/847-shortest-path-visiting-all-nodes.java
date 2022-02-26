class Solution {
    private int[][] cache;
    private int endingMask;
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        endingMask = (1<<n)-1;
        cache = new int[n+1][endingMask+1];
        
        int best = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            best = Math.min(best, dp(i, endingMask, graph));
        }
        return best;
    }
    
    public int dp(int i, int mask, int[][] graph) {
        if(cache[i][mask] != 0) 
            return cache[i][mask];
        if((mask & (mask-1)) == 0)
            return 0;
        
        cache[i][mask] = Integer.MAX_VALUE - 1;
        for(int ng : graph[i]) {
            if((mask & (1 << ng)) != 0) {
                int alVis = dp(ng, mask, graph);
                int notAlVis = dp(ng, mask ^ (1 << i), graph);
                int betterOpt = Math.min(alVis, notAlVis);
                cache[i][mask] = Math.min(cache[i][mask], 1 + betterOpt);
            }
        }
        return cache[i][mask];
    }
}