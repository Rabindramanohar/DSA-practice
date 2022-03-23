class Solution {
    public int brokenCalc(int s, int t) {
        int cnt = 0;
        while(t > s) {
            cnt++;
            if(t%2 == 1)
                t++;
            else
                t = t/2;
        }
        return cnt+s-t;
    }
}