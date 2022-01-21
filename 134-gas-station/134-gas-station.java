class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int start=0, tankGas=0, total=0;
        
        for(int i=0; i<n; i++) {
            total += gas[i]-cost[i];
            tankGas += gas[i]-cost[i];
            if(tankGas<0) {
                tankGas=0;
                start=i+1;
            }
        }
        return total<0?-1:start;
    }
}