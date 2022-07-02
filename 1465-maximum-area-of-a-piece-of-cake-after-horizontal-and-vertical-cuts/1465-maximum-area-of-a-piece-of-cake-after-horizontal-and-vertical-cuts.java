class Solution {
    public int maxArea(int h, int w, int[] hz, int[] vr) {
        Arrays.sort(hz);
        Arrays.sort(vr);
        int maxH = Math.max(hz[0], h-hz[hz.length-1]);
        int maxV = Math.max(vr[0], w-vr[vr.length-1]);
        
        for(int i=0; i<hz.length-1; i++)
            maxH = Math.max(maxH, hz[i+1]-hz[i]);
        for(int i=0; i<vr.length-1; i++)
            maxV = Math.max(maxV, vr[i+1]-vr[i]);
        
        return (int)((long)maxH * maxV % 1000000007);
    }
}