class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(color[i] == 0 && !isValid(graph, color, 1, i)) 
                return false;
        }
        return true;
    }
    private boolean isValid(int[][] g, int[] color, int curr, int node) {
        if(color[node] != 0)
            return color[node] == curr;
        color[node] = curr;
        for(int n : g[node])
            if(!isValid(g, color, -curr, n))
                return false;
        return true;
    }
}