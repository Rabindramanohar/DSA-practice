class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(n == 1 && trust.length == 0)
            return 1;
        
        int[] Judge = new int[n+1];
        
        for(int[] person : trust) {
            Judge[person[0]]--;
            Judge[person[1]]++;
        }
        
        for(int i=0; i<Judge.length; i++) {
            if(Judge[i] == n-1)
                return i;
        }
        
        return -1;
    }
}