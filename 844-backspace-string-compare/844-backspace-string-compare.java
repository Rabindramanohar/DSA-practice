class Solution {
    // 2 ptrs
    public boolean backspaceCompare(String s1, String s2) {
        int i = s1.length()-1, j = s2.length()-1;
        int skipS1=0, skipS2=0;
        while(i>=0 || j>=0) {
            while(i>=0) {
                if(s1.charAt(i) == '#') {
                    skipS1++;
                    i--;
                } else if(skipS1 > 0) {
                    skipS1--;
                    i--;
                } else 
                    break;
            }
            while(j>=0) {
                if(s2.charAt(j) == '#') {
                    skipS2++;
                    j--;
                } else if(skipS2 > 0) {
                    skipS2--;
                    j--;
                } else 
                    break;
            }
            if(i>=0 && j>=0 && s1.charAt(i) != s2.charAt(j))
                return false;
            if(i>=0 != j>=0)
                return false;
            i--;
            j--;
        }
        return true;
    }
}