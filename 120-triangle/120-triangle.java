class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return helper(triangle, 0, 0);
    }
    
    Map<String, Integer> hm = new HashMap<>();
    
    private int helper(List<List<Integer>> list, int i, int j) {
        if(i >= list.size()) return 0;
        
        String key = i + "|" + j;
        if(!hm.containsKey(key)) {
            hm.put(key, Math.min(helper(list, i+1, j), helper(list, i+1, j+1)) + list.get(i).get(j));
        }
        return hm.get(key);
    }
}