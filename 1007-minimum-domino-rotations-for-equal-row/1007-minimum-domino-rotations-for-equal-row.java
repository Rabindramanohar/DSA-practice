class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int AB = dominoRotate(tops, bottoms);
        int BA = dominoRotate(bottoms, tops);
        
        return AB == -1 ? BA : BA == -1 ? AB : Math.min(AB, BA);
    }
    
    public int dominoRotate(int[] A, int[] B) {
        int minRotate = Integer.MAX_VALUE;
        for(int d=1; d<=6; d++) {
            int swap = 0;
            int i=0;
            for(; i<A.length; i++) {
                if(A[i] == d) continue;
                else if(B[i] == d) swap++;
                else break;
            }
            if(i==A.length && minRotate > swap)
            minRotate = swap;
        }
        return minRotate == Integer.MAX_VALUE ? -1 : minRotate;
    }
}