class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = 1<<k;
        Set<String> hs = new HashSet<>();
        for(int i=k; i<=s.length(); i++) {
            String part = s.substring(i-k, i);
            if(!hs.contains(part)) {
                hs.add(part);
                total--;
                if(total == 0)
                    return true;
            }
        }
        return false;
    }
}