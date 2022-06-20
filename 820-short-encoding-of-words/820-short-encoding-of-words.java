class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (a, b) -> b.length()-a.length());
        StringBuilder sb = new StringBuilder();
        for(String w : words) {
            if(sb.indexOf(w+'#') == -1) 
                sb.append(w+'#');
        }
        return sb.length();
    }
}