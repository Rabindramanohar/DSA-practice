class Solution {
    public int[] countBits(int n) {
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=n; i++)
            list.add(countSetBit(i));
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            ans[i] = list.get(i);
        return ans;
    }
    
    private int countSetBit(int n) {
        if( n == 0)
            return 0;
        return 1 + countSetBit(n & (n-1));
    }
}