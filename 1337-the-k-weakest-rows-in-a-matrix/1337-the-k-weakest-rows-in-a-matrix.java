class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int n = mat.length;
        Map<Integer, Integer> hs = new HashMap<>();
        // iterate and count no of once
        for(int i=0; i<n; i++) {
            int cnt = 0;
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == 1) cnt++;
            }
            hs.put(i, cnt);
        }
        
        // convert hashset to list
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hs.entrySet());
        
        // sort hashset
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        for(int i=0; i<k; i++) {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}