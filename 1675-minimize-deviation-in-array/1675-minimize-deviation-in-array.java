class Solution {
    public int minimumDeviation(int[] nums) {
        int deviation = Integer.MAX_VALUE;
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(int ele : nums) {
            if(ele%2 == 1)
                ts.add(2*ele);
            else
                ts.add(ele);
        }
        
        while(true) {
            int max = ts.last();
            deviation = Math.min(deviation, max-ts.first());
            if(max%2 == 1)
                break;
            else {
                ts.remove(max);
                ts.add(max/2);
            }
        }
        
        return deviation;
    }
}