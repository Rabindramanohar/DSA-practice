class Solution {
    public int candy(int[] ratings) {
        // using 2 arrays
        int sum = 0, n = ratings.length;
        int[] l2r = new int[n];
        int[] r2l = new int[n];
        Arrays.fill(l2r, 1);
        Arrays.fill(r2l, 1);
        
        for(int i=1; i<n; i++) {
            if(ratings[i] > ratings[i-1])
                l2r[i] = l2r[i-1]+1;
        }
        
        for(int i=n-2; i>=0; i--) {
            if(ratings[i] > ratings[i+1])
                r2l[i] = r2l[i+1]+1;
        }
        
        // take sum max of both
        for(int i=0; i<n; i++) 
            sum += Math.max(l2r[i], r2l[i]);
        
        return sum;
    }
}