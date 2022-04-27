class Solution {
    final static int N = 100001;
    boolean[] vis = new boolean[N];
    List<Integer>[] adj = new ArrayList[N];
    
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        for(int i=0; i<s.length(); i++)
            adj[i] = new ArrayList<Integer>();
        
        for(List<Integer> edge: pairs) {
            int source = edge.get(0);
            int destination = edge.get(1);
            
            adj[source].add(destination);
            adj[destination].add(source);
        }
        
        char[] ans = new char[s.length()];
        for(int v=0; v<s.length(); v++) {
            if(!vis[v]) {
                List<Character> characters = new ArrayList<>();
                List<Integer> indices = new ArrayList<>();
                DFS(s, v, characters, indices);
                Collections.sort(characters);
                Collections.sort(indices);
                
                for(int i=0; i<characters.size(); i++)
                    ans[indices.get(i)] = characters.get(i);
            }
        }
        return new String(ans);  
    }
    
    private void DFS(String s, int v, List<Character> c, List<Integer> idx) {
        c.add(s.charAt(v));
        idx.add(v);
        vis[v] = true;
        
        for(int a : adj[v]) {
            if(!vis[a])
                DFS(s, a, c, idx);
        }
    }
}