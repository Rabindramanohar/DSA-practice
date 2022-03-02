class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null) return false;
        Map<Character, List<Integer>> hm = new HashMap<>(); // <char, indexes>
        
        // preprocessing of t
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(!hm.containsKey(c))
                hm.put(c, new ArrayList<Integer>());
            hm.get(c).add(i);
        }
        
        int prev = -1; // prev idx
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(hm.get(c) == null) return false;
            else {
                List<Integer> list = hm.get(c);
                prev = BSHelper(prev, list, 0, list.size()-1);
                if(prev == -1)
                    return false;
            }
            prev++;
        }
        return true;
    }
    private int BSHelper(int idx, List<Integer> list, int l, int h) {
        while(l <= h) {
            int mid = l + (h-l)/2;
            if(list.get(mid) < idx)
                l = mid+1;
            else 
                h = mid-1;
        }
        return l==list.size() ? -1 : list.get(l);
    }
}






