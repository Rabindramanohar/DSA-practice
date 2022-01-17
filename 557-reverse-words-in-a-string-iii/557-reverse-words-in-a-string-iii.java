class Solution {
    public String reverseWords(String s) {
        String charAr[] = s.split(" ");
        String ans = "";
        
        for(int i=0; i<charAr.length; i++) {
            StringBuilder sb = new StringBuilder(charAr[i]);
            ans = ans + sb.reverse() + " ";
        }
        
        return ans.trim();
    }
}