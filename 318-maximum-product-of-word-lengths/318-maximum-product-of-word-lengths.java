class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] state = new int[n];
        for(int i=0; i<n; i++)
            state[i] = getStateFromString(words[i]);
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((state[i] & state[j]) == 0)
                    if(words[i].length() * words[j].length() > max)
                        max = words[i].length() * words[j].length();
            }
        }
        return max;
    }
    private int getStateFromString(String s) {
        int state=0;
        for(char c : s.toCharArray()) {
            int idx = c-'a';
            state |= 1<<(idx);
        }
        return state;
    }
}