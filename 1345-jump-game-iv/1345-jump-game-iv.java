class Solution {
    public int minJumps(int[] ar) {
        int n = ar.length;
        if(n==1) return 0;
        
        Map<Integer, List<Integer>> hs = new HashMap<>();
        int steps = 0;
        
        for(int i=0; i<n; i++) {
            hs.computeIfAbsent(ar[i], ele -> new ArrayList<>()).add(i);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        
        while(!q.isEmpty()) {
            steps++;
            int size = q.size();
            for(int i=0; i<size; i++) {
                int j = q.poll();
                
                if(j-1 >= 0 && hs.containsKey(ar[j-1])) {
                    q.offer(j-1);
                }
                
                if(j+1 < n && hs.containsKey(ar[j+1])) {
                    if(j+1 == n-1) return steps;
                    q.offer(j+1);
                }
                
                if(hs.containsKey(ar[j])) {
                    for(int k:hs.get(ar[j])) {
                        if(k != j) {
                            if(k == n-1) return steps;
                            q.offer(k);
                        }
                    }
                }
                hs.remove(ar[j]);
            }
        }
        return steps;
    }
}