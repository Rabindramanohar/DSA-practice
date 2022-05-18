class Solution {
    int[] parent;
    int[] disc;
    int[] low;
    boolean[] vis;
    int time;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> conn) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) 
            graph.add(new ArrayList<>());
        for(int i=0; i<conn.size(); i++) {
            int u = conn.get(i).get(0);
            int v = conn.get(i).get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
            
        parent = new int[n];
        disc = new int[n];
        low = new int[n];
        vis = new boolean[n];
        time =0;

        List<List<Integer>> ans = new ArrayList<>();
        bridges(0, graph, ans);
        
        return ans;
    }
    
    private void bridges(int u, List<List<Integer>> graph, List<List<Integer>> ans) {
        disc[u]=low[u]=time;
        time++;
        vis[u] = true;
        for(int i=0; i<graph.get(u).size(); i++) {
            int v = graph.get(u).get(i);
            if(parent[u] == v) continue;
            else if(vis[v] == true) low[u] = Math.min(low[u], disc[v]);
            else {
                parent[v] = u;
                bridges(v, graph, ans);
                
                low[u] = Math.min(low[u], low[v]);
                if(low[v] > disc[u]) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(u);
                    tmp.add(v);
                    ans.add(tmp);
                }
            }
        }
    }
}







