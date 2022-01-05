class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> linkedHm = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(linkedHm.containsKey(s.charAt(i))) {
                linkedHm.put(s.charAt(i), linkedHm.get(s.charAt(i))+1);
            } else
                linkedHm.put(s.charAt(i), 0);
        }
        
        for(int i=0; i<s.length(); i++) {
            if(linkedHm.get(s.charAt(i)) == 0)
                return i;
        }
        
        return -1;
    }
}