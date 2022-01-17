class Solution {
    public boolean wordPattern(String pattern, String s) {
        char patternArr[] = pattern.toCharArray();
        String strArr[] = s.split(" ");
        if(patternArr.length != strArr.length) return false;
        // storing values in map
        Map<Character, String> hm = new HashMap<>();
        for(int i=0; i<patternArr.length; i++) {
            if(hm.containsKey(patternArr[i])) {
                if (!hm.get(patternArr[i]).equals(strArr[i]))
                    return false;
            } else {
                if(hm.containsValue(strArr[i])) return false;
                hm.put(patternArr[i], strArr[i]);
            }
        }
        return true;
    }
}